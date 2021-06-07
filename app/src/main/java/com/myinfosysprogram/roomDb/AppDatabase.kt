package com.myinfosysprogram.roomDb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.myinfosysprogram.model.response.DBResponse

@Database(entities = [DBResponse::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun rowsDao(): RowsDao
}