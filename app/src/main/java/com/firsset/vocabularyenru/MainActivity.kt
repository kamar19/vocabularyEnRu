package com.firsset.vocabularyenru

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.commitNow
import com.firsset.vocabul.FragmentWord
import com.firsset.vocabularyenru.data.models.Word
import com.firsset.vocabularyenru.data.repository.WordRepository
import com.firsset.vocabularyenru.data.storage.RepositoryDB
import com.firsset.vocabularyenru.data.storage.WordDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private var findText: InstantAutoComplete? = null
    private lateinit var repositoryDB: RepositoryDB
    private lateinit var wordDatabase: WordDatabase
    var vocType: String = "rus"
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    lateinit var   fragmentWord: FragmentWord

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wordDatabase = WordDatabase.createWordDatabaseInstance(this)
        repositoryDB = RepositoryDB(wordDatabase)
        coroutineScope.launch {
            openDB("rus")
            saveIntoRep()
            findText = findViewById(R.id.descriptionAutoCompleteTextView)
            if (savedInstanceState == null) {
                fragmentWord=FragmentWord.newInstance(vocType)
                showFragmentOne(vocType)
            }
        }
    }
    fun showFragmentOne(vocType :String ) {
        supportFragmentManager.commitNow {
            replace(
                R.id.main_layout,
                fragmentWord,
                FRAGMENT_ONE
            )
        }
    }

    fun saveIntoRep() {
        if (words != null) {
            if (words!!.size <= 0) {
                var tempWords: List<Word>? = null
                var workRep: WordRepository = WordRepository()
                tempWords = workRep.getWordList()
                words!!.addAll(tempWords)
                coroutineScope.launch {
                    words?.let { repositoryDB.saveWordsToDB(it) }
                }
            } else {
                words?.let {
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun updateAdapter(){
        if (vocType.equals("rus")) {
            fragmentWord.imageView2.setBackgroundResource(R.drawable.rus)
        } else {
            fragmentWord.imageView2.setBackgroundResource(R.drawable.eng)
        }
        coroutineScope.launch {
            words = repositoryDB.readWordsFromDb(vocType)
            fragmentWord.adapter?.listWords = MainActivity.words!!
            fragmentWord.adapter?.notifyDataSetChanged()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuEng -> {
                vocType="eng"
                updateAdapter()
            }
            R.id.menuRus -> {
                vocType="rus"
                updateAdapter()
            }
            R.id.menuExit -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    suspend fun openDB(vocType: String) {
        words = repositoryDB.readWordsFromDb(vocType)
    }

    suspend fun saveWordsToDB() {
        words?.let { repositoryDB.saveWordsToDB(it) }
    }

    companion object {
        val FRAGMENT_ONE = "FRAGMENT_ONE"
        var words: MutableList<Word>? = null
    }
    fun updateFragmentWord() {
            supportFragmentManager.popBackStack(
                FRAGMENT_ONE,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
            supportFragmentManager.commit {
                addToBackStack(FRAGMENT_ONE)
                replace(R.id.main_layout, FragmentWord.newInstance(vocType))
            }

    }

}


