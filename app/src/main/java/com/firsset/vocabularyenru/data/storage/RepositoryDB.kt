package com.firsset.vocabularyenru.data.storage

import com.firsset.vocabularyenru.data.models.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RepositoryDB(val wordDatabase: WordDatabase) {
    val localDataStore: WordDAO = wordDatabase.wordDAO

    suspend fun readWordsFromDb(vocType: String): MutableList<Word> =
        withContext(Dispatchers.IO) {
            localDataStore.getAllWordsFromType(vocType)
        }

    suspend fun saveWordsToDB(words: MutableList<Word>) {
        withContext(Dispatchers.IO) {
            localDataStore.insertWords(words)
        }
    }

    suspend fun saveWordToDB(word: Word) {
        withContext(Dispatchers.IO) {
            localDataStore.insertWord(word)
        }
    }

}