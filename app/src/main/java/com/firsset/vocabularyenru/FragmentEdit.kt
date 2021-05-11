package com.firsset.vocabularyenru

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.firsset.vocabul.FragmentWord
import com.firsset.vocabularyenru.MainActivity.Companion.FRAGMENT_ONE
import com.firsset.vocabularyenru.data.models.Word
import com.firsset.vocabularyenru.data.storage.RepositoryDB
import com.firsset.vocabularyenru.data.storage.WordDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class FragmentEdit : Fragment() {
    var idWord: Int = 0
    var wordEditString: String = ""
    var vocEditString: String = ""
    var vocTypeString: String = ""
    lateinit var buttonSave: Button
    lateinit var wordEditText: EditText
    lateinit var vocEditText: EditText
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    private lateinit var repositoryDB: RepositoryDB
    private lateinit var wordDatabase: WordDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let {
            idWord = it.getInt(KEY_PARSE_ID, 0)
            wordEditString = it.getString(KEY_PARSE_WORD, "word")
            vocTypeString = it.getString(KEY_PARSE_TYPE, "rus")
            vocEditString = it.getString(KEY_PARSE_VOC, "слово")
        }
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        super.onDestroyView()
        showFragmentWord()
    }

    fun showFragmentWord() {
        activity?.let {
            it.supportFragmentManager.popBackStack(
                FRAGMENT_ONE,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
            it.supportFragmentManager.commit {
                addToBackStack(FRAGMENT_ONE)
                replace(R.id.main_layout, FragmentWord.newInstance(vocTypeString))
            }
        }
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        wordEditText = view.findViewById<EditText>(R.id.wordEditText)
        vocEditText = view.findViewById<EditText>(R.id.vocEditText)
        buttonSave = view.findViewById<Button>(R.id.buttonSave)
        wordEditText.setText(wordEditString)
        vocEditText.setText(vocEditString)
        wordDatabase = WordDatabase.createWordDatabaseInstance(view.context)
        repositoryDB = RepositoryDB(wordDatabase)
        if (idWord >= 0) {
            buttonSave.visibility = View.VISIBLE
        } else {
            buttonSave.visibility = View.INVISIBLE
        }
        wordEditText.addTextChangedListener { charSequence ->
            buttonSave.visibility = View.VISIBLE;
        }
        buttonSave.setOnClickListener(View.OnClickListener {
            if ((wordEditText.text.length > 0) && (vocEditText.text.length > 0)) {
                coroutineScope.launch {
                    var tempWord: Word = Word(
                        idWord + 1,
                        wordEditText.text.toString(),
                        vocEditText.text.toString(),
                        vocTypeString
                    )
                    repositoryDB.saveWordToDB(tempWord)
                    MainActivity.words = repositoryDB.readWordsFromDb(vocTypeString)
                    showFragmentWord()
                }
            }
        })
    }

    companion object {
        const val KEY_PARSE_ID = "ID_WORD"
        const val KEY_PARSE_WORD = "WORD"
        const val KEY_PARSE_VOC = "VOC"
        const val KEY_PARSE_TYPE = "TYPE"
        fun newInstance(idWord: Int, wordEditText: String, vocEditText: String, vocType: String) =
            FragmentEdit().apply {
                arguments = Bundle().apply {
                    putInt(KEY_PARSE_ID, idWord)
                    putString(KEY_PARSE_WORD, wordEditText)
                    putString(KEY_PARSE_VOC, vocEditText)
                    putString(KEY_PARSE_TYPE, vocType)
                }
            }
    }
}