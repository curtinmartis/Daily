package com.appathylabs.daily.room.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import android.support.annotation.Keep
import com.appathylabs.daily.room.entities.Task
import io.reactivex.Flowable

@Keep
@Dao
interface TasksDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addTask(task: Task)

    @Query("SELECT * FROM tasks")
    fun getAllTasks(): Flowable<List<Task>>
}
