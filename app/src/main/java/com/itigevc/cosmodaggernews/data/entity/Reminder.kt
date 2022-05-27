package com.itigevc.cosmodaggernews.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminders")
data class Reminder(

    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "date") var date: String,
    @ColumnInfo(name = "time") var time: String,
    @ColumnInfo(name = "repeat") var repeat: Boolean,
    @ColumnInfo(name = "repeat_no") var repeatNo: Int,
    @ColumnInfo(name = "repeat_type") var repeatType: String,
    @ColumnInfo(name = "active") var active: Boolean)

{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id:Long = 0
}
