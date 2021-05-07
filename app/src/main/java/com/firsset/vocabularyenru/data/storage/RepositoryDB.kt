package com.firsset.vocabularyenru.data.storage

import android.util.Log
import com.firsset.vocabularyenru.data.models.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RepositoryDB(val wordDatabase: WordDatabase) {
     val localDataStore: WordDAO = wordDatabase.wordDAO

    suspend fun readWordsFromDb(vocType: String): List<Word> =
        withContext(Dispatchers.IO) {
            Log.d("readWordsFromDb", vocType)

            localDataStore.getAllWordsFromType(vocType)
        }

    suspend fun saveWordsToDB(words: List<Word>) {
        Log.d("saveWordsToDB", words.size.toString())

        withContext(Dispatchers.IO) {
            localDataStore.insertWords(words)
        }
    }

    suspend fun saveWordToDB(word: Word) {
        Log.d("saveWordToDB", word.id.toString()+" - "+word.word+" - "+word.vocType)

        withContext(Dispatchers.IO) {
            localDataStore.insertWord(word)
        }
    }

}