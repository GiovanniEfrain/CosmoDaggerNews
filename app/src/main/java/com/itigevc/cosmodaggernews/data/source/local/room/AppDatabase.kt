package com.itigevc.cosmodaggernews.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.itigevc.cosmodaggernews.data.entity.Reminder

@Database(entities = [Reminder::class], version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun reminderDao(): ReminderDao

}