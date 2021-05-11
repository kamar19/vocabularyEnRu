package com.firsset.vocabul

import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.firsset.vocabularyenru.FragmentEdit
import com.firsset.vocabularyenru.InstantAutoComplete
import com.firsset.vocabularyenru.MainActivity
import com.firsset.vocabularyenru.MainActivity.Companion.words
import com.firsset.vocabularyenru.R
import com.firsset.vocabularyenru.data.WordAdapter
import com.firsset.vocabularyenru.data.models.Word
import com.firsset.vocabularyenru.data.storage.RepositoryDB
import com.firsset.vocabularyenru.data.storage.WordDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*


class FragmentWord : Fragment(),
    View.OnClickListener,
    WordAdapter.OnItemClickListener {
    var wordList: MutableList<Word> = ArrayList<Word>()
    var vocType: String = "rus"
    var recyclerView: RecyclerView? = null
    public var adapter: WordAdapter? = null

    //    var button: Button? = null
    var savedInstanceState: Bundle? = null
    lateinit var repositoryDB: RepositoryDB
    lateinit var wordDatabase: WordDatabase
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    lateinit var imageView: View
    lateinit var imageView2: View
    var editText: InstantAutoComplete? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            this.savedInstanceState = savedInstanceState
        }
        retainInstance = true


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let { vocType = it.getString(KEY_PARSE_DATA, "rus") }

        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        wordDatabase = WordDatabase.createWordDatabaseInstance(view.context)
        repositoryDB = RepositoryDB(wordDatabase)
        MainActivity.words?.let { wordList = MainActivity.words!! }
        imageView = view.findViewById<View>(R.id.plusImageView).apply {
            setOnClickListener {
                callFragmentEdit(0, "", "", vocType)
            }
        }
        imageView2 = view.findViewById<View>(R.id.notesImageView).apply {
            setOnClickListener {
                if (vocType.equals("rus")) {
                    vocType = "eng"
                    imageView2.setBackgroundResource(R.drawable.eng)
                } else {
                    vocType = "rus"
                    imageView2.setBackgroundResource(R.drawable.rus)
                }
                coroutineScope.launch {
                    MainActivity.words = repositoryDB.readWordsFromDb(vocType)
                    adapter?.listWords = MainActivity.words!!
                    adapter?.notifyDataSetChanged()
                }
            }
        }

        recyclerView = view.findViewById(R.id.listRecycler)
        adapter = WordAdapter(context, wordList, this)
        recyclerView?.setAdapter(adapter)
        editText = view.findViewById(R.id.descriptionAutoCompleteTextView)
        editText?.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(
                textChar: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                if (textChar.toString().equals("")) {
                    adapter =
                        WordAdapter(context, wordList, object : WordAdapter.OnItemClickListener {
                            fun onItemClick(
                                parent: AdapterView<*>?,
                                v: View?,
                                position: Int,
                                id: Long
                            ) {
                                // Do something in response to the click
                            }

                            override fun onItemClick(position: Int) {
                                val word: Word? = MainActivity.words?.get(position)
                                word?.let {
                                    callFragmentEdit(
                                        it.id,
                                        it.word,
                                        it.transfer,
                                        it.vocType
                                    )
                                }
                            }
                        })

                } else {
                    // perform search
                    if (textChar?.length!! > 0)
                        searchItem(textChar);
                }
            }

        });

    }

    fun searchItem(textToSearch: CharSequence) {
        coroutineScope.launch {

            MainActivity.words = repositoryDB.readWordsFromDb(vocType)
            var tempWord: List<Word>? =
                MainActivity.words?.filter { p -> p.word.contains(textToSearch) }
            MainActivity.words?.clear()
            if (tempWord != null) {
                MainActivity.words?.addAll(tempWord)
            }
            adapter?.listWords = MainActivity.words!!
            adapter?.notifyDataSetChanged()
        }
    }


    override fun onClick(v: View?) {
    }

    fun callFragmentEdit(
        id: Int,
        wordEdit: String,
        vocEditString: String,
        vocTypeString: String
    ) {
        var tempWords: List<Word>? = MainActivity.words
        var idMax: Int = 0

        if (id <= 0) {
            if (tempWords != null) {
                for (i in tempWords) {
                    if (i.id > idMax) {
                        idMax = i.id
                    }
                }
            }
        }
        activity?.let {
            it.supportFragmentManager.findFragmentByTag(FRAGMENT_TWO)
            it.supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.main_layout,
                    FragmentEdit.newInstance(idMax, wordEdit, vocEditString, vocTypeString)
                )
                .addToBackStack(FRAGMENT_TWO)
                .commit()
        }
    }

    companion object {
        const val KEY_PARSE_DATA = "VOC_TYPE"
        val FRAGMENT_TWO = "FRAGMENT_TWO"

        fun newInstance(vocType: String) = FragmentWord().apply {
            arguments = Bundle().apply {
                putString(KEY_PARSE_DATA, vocType)
                adapter?.notifyDataSetChanged()

            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onItemClick(position: Int) {
        val word: Word? = MainActivity.words?.get(position)
        word?.let { callFragmentEdit(it.id, it.word, it.transfer, it.vocType) }
    }
}