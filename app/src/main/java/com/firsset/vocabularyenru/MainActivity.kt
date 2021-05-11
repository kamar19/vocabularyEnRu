package com.firsset.vocabularyenru

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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
                showFragmentOne()
            }
        }
    }
    fun showFragmentOne() {
        supportFragmentManager.commitNow {
            replace(
                R.id.main_layout,
                FragmentWord.newInstance(vocType),
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
                Log.d("callFragmentEdit", "words is not db = " + tempWords?.size.toString())
                words!!.addAll(tempWords)
                coroutineScope.launch {
                    words?.let { repositoryDB.saveWordsToDB(it) }
                }
            } else {
                words?.let {
                    Log.d("callFragmentEdit", "words in db  = " + it.size.toString())
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuEng -> {
            }
            R.id.menuRus -> {
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
}


