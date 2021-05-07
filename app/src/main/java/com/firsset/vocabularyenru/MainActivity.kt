package com.firsset.vocabularyenru

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
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
    public var vocType: String = "rus"
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    var fragmentManager: FragmentManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordDatabase = WordDatabase.createWordDatabaseInstance(this)
        repositoryDB = RepositoryDB(wordDatabase)
        coroutineScope.launch {
            openDB("rus")
            saveIntoRep()

            findText = findViewById(R.id.descriptionAutoCompleteTextView)
//            if (savedInstanceState == null) {
//                fragmentManager = supportFragmentManager
//                fragmentManager!!.beginTransaction()
//                    .replace(R.id.main_layout, FragmentWord.newInstance(vocType), FRAGMENT_ONE)
//                    .commit()
//            }
            if (savedInstanceState == null) {
                supportFragmentManager.commitNow {
                    replace(
                        R.id.main_layout,
                        FragmentWord.newInstance(vocType),
                        FRAGMENT_ONE
                    )
                }
            }

        }

    }

    public fun saveIntoRep() {
        if (words != null) {
            if (words!!.size <= 0) {
                var tempWords: List<Word> = WordRepository().getWordList(vocType)
                Log.d("words is not db ", tempWords.size.toString())
                words = tempWords
                coroutineScope.launch {
                    words?.let { repositoryDB.saveWordsToDB(it) }
                }
            } else {
                words?.let {
                    Log.d("words in db", it.size.toString())
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

    var listItems2: java.util.ArrayList<String>? = null
    var adapter2: ArrayAdapter<Word>? = null

    suspend fun openDB(vocType: String) {
        words = repositoryDB.readWordsFromDb(vocType)
    }
//    fun openOneFragment(vocType: String) {
//        supportFragmentManager.popBackStack(FRAGMENT_TAG_MOVIES_DETAILS, FragmentManager.POP_BACK_STACK_INCLUSIVE)
//        supportFragmentManager.commit {
//            addToBackStack(FRAGMENT_ONE)
//            replace(R.id.main_layout, FragmentWord(), FRAGMENT_ONE)
//        }
//    }

//    fun loadListViewDetails() {
//            if (words.size > 0) {
//                listItems2 =
//                    ArrayList(Arrays.asList<String>(words))
//                findText!!.onItemClickListener =
//                    OnItemClickListener { adapterView, view, position, id ->
//                        findText.setText(listItems2.get(position))
//                        findText!!.setSelection(
//                            findText!!.text.length()
//                        )
//                    }
//                adapter2 = ArrayAdapter<String>(
//                    view.getContext(),
//                    R.layout.call_taxi_list_details,
//                    R.id.fastTakeItem,
//                    listItems2
//                )
//                findText!!.threshold = 1
//                findText!!.setAdapter(adapter2)
//            }
//        }
//    }

    suspend fun saveWordsToDB() {
        words?.let { repositoryDB.saveWordsToDB(it) }
    }

    //
//
//    suspend fun  loadWordsFromDB(vocType: String):List<Word> {
//        return withContext(Dispatchers.IO) {repositoryDB.readWordsFromDb(vocType)}
//    }
//    private var db: SQLiteDatabase? = null
//    var cursor: Cursor? = null
//
//    fun setInitialData() {
//        db = baseContext.openOrCreateDatabase(
//            "wordVoc.db",
//            Context.MODE_PRIVATE,
//            null
//        )
//        //        db.e
////        if (db.isOpen()) {
//        try {
//            cursor = db.rawQuery("SELECT * FROM lessons3 ", null)
//        } catch (e: Exception) {
//            // таблица не создана
//        }
//        if (cursor != null) if (cursor.getCount() > 0) {
//            cursor.moveToFirst()
//            while (!cursor.isAfterLast()) {
////        }
////        while (cursor.moveToNext()) {
//                //  ( 'id'=?, '" + lessonSummary.getNameUser() + "', " + lessonSummary.getCountPoints() +", '" + lessonSummary.getDateLesson() + "' , '" + lessonSummary.getImage()
//                //                + "', '" + lessonSummary.getStringPrimerovTasks() + "', '" + lessonSummary.getStringMDSA() + "', '" + lessonSummary.getStringMultiplyNumbers() + "')";
//                val tempLessonSummary =
//                    LessonSummary( //    public LessonSummary(String nameUser, String imageFileName, int countPoints, String stringPrimerovTasks, String stringMDSA, String stringMultiplyNumbers) {
//                        //                    cursor.getInt(1),//ID
//                        cursor.getString(1),  //getNameUser()
//                        cursor.getString(2),  //getDateLesson
//                        cursor.getInt(3),  //countPoints
//                        cursor.getString(4),  //getStringMDSA
//                        cursor.getString(5)
//                    ) //getStringMultiplyNumbers
//                lessonSummaryList.add(tempLessonSummary)
//                cursor.moveToNext()
//            }
//            //            }
//            cursor.close()
//        }
//    }


    companion object {
        val FRAGMENT_ONE = "FRAGMENT_ONE"
        var words: List<Word>? = null

    }
}


