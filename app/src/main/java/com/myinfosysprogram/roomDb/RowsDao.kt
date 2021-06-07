package com.myinfosysprogram.roomDb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.myinfosysprogram.model.response.DBResponse

@Dao
interface RowsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRow(rows: DBResponse)

    @Query("Select * from DBResponse")
    fun getAllRows(): List<DBResponse>

    @Query("DELETE FROM DBResponse")
    fun nukeTable()
}