package com.firsset.vocabul

import com.firsset.vocabularyenru.FragmentEdit
import com.firsset.vocabularyenru.MainActivity
import com.firsset.vocabularyenru.R

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
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
    var wordList: List<Word> = ArrayList<Word>()
    var vocType: String = "rus"
    var recyclerView: RecyclerView? = null
    lateinit var adapter :WordAdapter

    //    var button: Button? = null
    var savedInstanceState: Bundle? = null
    lateinit var repositoryDB: RepositoryDB
    lateinit var wordDatabase: WordDatabase
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    lateinit var imageView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            this.savedInstanceState = savedInstanceState
        }
        retainInstance = true
        Log.d("callFragmentEdit", "10")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let { vocType = it.getString(KEY_PARSE_DATA, "rus") }
        Log.d("callFragmentEdit", "20")

        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {

        wordDatabase = WordDatabase.createWordDatabaseInstance(view.context)
        repositoryDB = RepositoryDB(wordDatabase)
//        coroutineScope.launch {
//            wordList = repositoryDB.readWordsFromDb(vocType)
        MainActivity.words?.let { wordList = MainActivity.words!! }

//            Log.d("words in Frag", wordList.size.toString())
//            Log.d("words in Frag", vocType)
//
//            for (wordLists: Word in wordList) {
//                Log.d("words in Frag", "00")
//
//                Log.d("word in Frag", wordLists.word)
//                Log.d("word in Frag", wordLists.transfer)
//                Log.d("word in Frag", wordLists.vocType)
//            }
        Log.d("callFragmentEdit", "00")

        imageView = view.findViewById<View>(R.id.plusImageView).apply {
            setOnClickListener {
                callFragmentEdit(0, "", "", vocType)
            }
        }
        imageView = view.findViewById<View>(R.id.notesImageView).apply {
            setOnClickListener {
                if (vocType.equals("rus")) {
                    vocType = "eng"
                } else {
                    vocType = "rus"
                }
                Log.d("callFragmentEdit_10", vocType)
                coroutineScope.launch {
                    MainActivity.words = repositoryDB.readWordsFromDb(vocType)
                    adapter.listWords = MainActivity.words!!
                    adapter.notifyDataSetChanged()
                }
            }
        }

//        locationRepository = WordDatabase.instance
//        initialData()
        recyclerView = view.findViewById(R.id.listRecycler)
        adapter = WordAdapter(context, wordList, this)
//        recyclerView?.setLayoutManager(
//            LinearLayoutManager(
//                activity,
//                RecyclerView.VERTICAL,
//                false
//            )
//        )

        recyclerView?.setAdapter(adapter)
//        button = view.findViewById(R.id.historyButtonClear)
//        button?.setOnClickListener(this)
//        }
    }

    override fun onClick(v: View?) {
//          switch (v.getId()) {
//              case R . id . buttonDigit1 :
//              textViewAnswerShowBasic.setText(tempQuestion + "1");
//              break;
//              case R . id . buttonDigit2 :
//              textViewAnswer
//          }
    }
//    var fragmentManager: FragmentManager? = null


    @RequiresApi(Build.VERSION_CODES.N)
    fun callFragmentEdit(
        id: Int,
        wordEdit: String,
        vocEditString: String,
        vocTypeString: String
    ) {
        var tempWords: List<Word>? = MainActivity.words
        var idMax:Int = 0

        if (id <= 0) {
            if (tempWords != null) {
                for (i in tempWords) {
                    if (i.id>idMax) {
                        idMax = i.id
                    }
                }

                Log.d("callFragmentEdit_max", idMax.toString())
            }

        }
        Log.d("callFragmentEdit", "50")
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
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onItemClick(position: Int) {
        val word:Word? = MainActivity.words?.get(position)
        word?.let { callFragmentEdit(it.id,it.word,it.transfer,it.vocType) }
    }
}