package com.firsset.vocabularyenru

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.firsset.vocabularyenru.data.WordAdapter
import com.firsset.vocabularyenru.data.models.Word
import com.firsset.vocabularyenru.data.storage.RepositoryDB
import com.firsset.vocabularyenru.data.storage.WordDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import java.util.*

class FragmentWord : Fragment(),
    View.OnClickListener,
    WordAdapter.OnItemClickListener {
    var wordList: List<Word> = ArrayList<Word>()
    var vocType: String = "rus"
    var recyclerView: RecyclerView? = null

    //    var button: Button? = null
    var savedInstanceState: Bundle? = null
    lateinit var repositoryDB: RepositoryDB
    lateinit var wordDatabase: WordDatabase
    var coroutineScope = CoroutineScope(Dispatchers.Main)
    lateinit var imageView: ImageView

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

        imageView =  view.findViewById<ImageView>(R.id.plusImageView)
        imageView.setOnClickListener{
            if (vocType.equals("rus"))
            {
                vocType="eng"

            } else {
                vocType = "rus"
            }
            callFragmentEdit(id: Long, viewWord: View)
        }

//        locationRepository = WordDatabase.instance
//        initialData()
        recyclerView = view.findViewById(R.id.listRecycler)
        var adapter = WordAdapter(context, wordList, this)
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


    private fun initialData() {
//        wordList = locationRepository?.wordDAO?.getAllWordsFromType("rus")!!
//        if (wordList.size > 0) {
//            wordList.clear()
//            for (i in wordList.indices) {
//                val trackSummary = TrackSummary(
//                    locationUserList[i].track,
//                    locationUserList[i].id,
//                    locationUserList[i].time
//                )
//                trackSummaryList.add(trackSummary)
//            }
//        }
    }


//   fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
////        val item: String = trackSummaryList[position].getDate()
////        val polylineOptions = PolylineOptions()
////        MainActivity.fragmentManager.popBackStack()
////        MyMapFragment.listLocationUser =
////            locationRepository.readLocation(trackSummaryList[position].getIdTrack())
////        Log.v(
////            "getIdTrack",
////            java.lang.String.valueOf(trackSummaryList[position].getIdTrack())
////        )
//    }

    override fun onClick(v: View?) {
//          switch (v.getId()) {
//              case R . id . buttonDigit1 :
//              textViewAnswerShowBasic.setText(tempQuestion + "1");
//              break;
//              case R . id . buttonDigit2 :
//              textViewAnswer
//          }
    }

    fun callFragmentEdit(id: Long, viewWord: View) {
        activity?.let {
            it.supportFragmentManager.findFragmentByTag(MainActivity.FRAGMENT_TWO)
            it.supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_layout, FragmentEdit.newInstance(id))

                .addToBackStack(MainActivity.FRAGMENT_TWO)
                .commit()
        }

    }

    companion object {
        const val KEY_PARSE_DATA = "VOC_TYPE"
        fun newInstance(vocType: String) = FragmentWord().apply {
            arguments = Bundle().apply {
                putString(KEY_PARSE_DATA, vocType)
            }
        }
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }
}