package com.firsset.vocabularyenru.data.models

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.firsset.vocabularyenru.data.storage.Contract


@Entity(
    tableName = Contract.TABLE_NAME
)
data class Word(
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0,
    var word: String="",
    var transfer: String="",
    var vocType: String=""
)

