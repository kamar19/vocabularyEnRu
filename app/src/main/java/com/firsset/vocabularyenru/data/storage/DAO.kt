package com.firsset.vocabularyenru.data.storage

import androidx.room.*
import com.firsset.vocabularyenru.data.models.Word


@Dao
interface WordDAO {

    @Query("SELECT * FROM vocAll where vocType=:vocType")
    fun getAllWordsFromType(vocType:String): List<Word>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWord(word: Word)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWords(users: List<Word>)


}
