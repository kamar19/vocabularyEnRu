package com.firsset.vocabularyenru.data.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.firsset.vocabularyenru.data.models.Word


@Database(entities = [Word::class], version = 3)
abstract class WordDatabase : RoomDatabase() {
        abstract val wordDAO: WordDAO

        companion object {
            var instance: WordDatabase? = null
            fun createWordDatabaseInstance(applicationContext: Context): WordDatabase {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        applicationContext,
                        WordDatabase::class.java,
                        Contract.DATABASE_NAME
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance as WordDatabase
            }
        }
    }
