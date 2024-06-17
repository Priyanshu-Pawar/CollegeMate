package com.example.collegestore.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.collegestore.models.DemoModel

private const val DB_NAME = "database"

@Database(
    entities = [DemoModel::class],
    version = 1,
    exportSchema = false
)
abstract class MainDataBase : RoomDatabase() {

    abstract fun demoDao(): DemoDao

    companion object {
        private var INSTANCE: MainDataBase? = null
        fun getDatabase(context: Context): MainDataBase = INSTANCE ?: synchronized(this) {
            INSTANCE ?: Room.databaseBuilder(
                context.applicationContext, MainDataBase::class.java, DB_NAME
            ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
                .also { INSTANCE = it }
        }
    }
}