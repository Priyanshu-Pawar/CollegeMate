package com.example.collegestore

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.example.collegestore.database.MainDataBase
import com.example.collegestore.utilities.MediaDataSources
import com.example.collegestore.viewmodel.mainRepository.MainRepository

class ClassApplication : Application() {

    lateinit var repository: MainRepository
    lateinit var dataBase: MainDataBase
    lateinit var mediaDataSource: MediaDataSources
//    lateinit var sharedPreferencesHelper: SharedPreferencesHelper

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
//        sharedPreferencesHelper = SharedPreferencesHelper(applicationContext)
        dataBase = MainDataBase.getDatabase(applicationContext)
        mediaDataSource = MediaDataSources(applicationContext)
        repository = MainRepository(mediaDataSource)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }


}