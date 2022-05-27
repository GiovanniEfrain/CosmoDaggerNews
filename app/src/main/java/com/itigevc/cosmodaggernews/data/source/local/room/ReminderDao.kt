package com.itigevc.cosmodaggernews.data.source.local.room

import androidx.room.*
import com.itigevc.cosmodaggernews.data.entity.Reminder
import io.reactivex.Single

/**
 * Created by kodeartisan on 19/11/17.
 */
@Dao
interface ReminderDao{

    @Query("SELECT * FROM reminders order by id DESC")
    fun getReminders(): Single<List<Reminder>>

    @Query("SELECT * FROM reminders where id = :id")
    fun getReminder(id: Int): Single<Reminder>

    @Insert
    fun insert(reminder: Reminder): Long

    @Delete
    fun delete(reminder: List<Reminder>)

    @Update
    fun update(reminder: Reminder): Int

}