package com.appathylabs.daily.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.support.annotation.Keep
import com.appathylabs.daily.room.dao.TasksDao
import com.appathylabs.daily.room.entities.Category
import com.appathylabs.daily.room.entities.Task
import javax.inject.Singleton

@Keep
@Singleton
@Database(entities = [Task::class, Category::class], version = 1)
abstract class DailyDatabase : RoomDatabase() {
    abstract val tasksDao: TasksDao
}
