package com.myinfosysprogram.model.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class DBResponse(val response: String = "") {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}