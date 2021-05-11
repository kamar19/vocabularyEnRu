package com.firsset.vocabularyenru.data.di

//import com.firsset.vocabularyenru.data.storage.RepositoryDB
//import com.firsset.vocabularyenru.data.storage.WordDatabase
//import com.firsset.vocabularyenru.viewModelWord.ViewModelWordList
//import org.koin.android.viewmodel.dsl.viewModel
//import org.koin.core.component.KoinApiExtension
//import org.koin.dsl.module

//
//@KoinApiExtension
//object koinModule {
//    val wordListModul = module {
//        single { WordDatabase.createWordDatabaseInstance(get()) }
//        single { RepositoryDB(get()) }
//        viewModel { ViewModelWordList(get(), get()) }
//    }
//    val wordDetailsModul = module {
////        viewModel { ViewModelMovieDetails(get(), get()) }
//    }
//}