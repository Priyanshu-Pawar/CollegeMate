package com.example.collegestore.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "DemoTB")
data class DemoModel(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var contactId: Long = 0,
    var contactUri: String = "",
    var contactName: String = "",
    var contactProfile: String = "",
    var contactFavorites: Int = 0,
    var defaultPhoneNumber: String = "",
    var defaultEmail: String = ""
) : Serializable
