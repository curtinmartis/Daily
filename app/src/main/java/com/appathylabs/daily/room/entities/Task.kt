package com.appathylabs.daily.room.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import android.support.annotation.Keep
import java.util.*

@Keep
@Entity(tableName = "tasks")
class Task(@ColumnInfo(name = "title") val title: String,
           @ColumnInfo(name = "category") @TypeConverters(Category::class) val category: Category,
           @ColumnInfo(name = "created_at") val createdAt: Date) {

    @PrimaryKey(autoGenerate = true) val id: Int = 0

    override fun equals(other: Any?): Boolean {
        return other != null
                && other is Task
                && other.id == id
                && other.title == title
                && other.category == category
                && other.createdAt == createdAt
    }

    override fun hashCode(): Int {
        return id.hashCode() + title.hashCode() + category.hashCode() + createdAt.hashCode()
    }
}
