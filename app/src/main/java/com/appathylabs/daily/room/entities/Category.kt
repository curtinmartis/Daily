package com.appathylabs.daily.room.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.TypeConverter
import android.support.annotation.Keep
import android.support.annotation.StringRes
import com.appathylabs.daily.R

@Keep
@Entity(tableName = "categories")
enum class Category(@StringRes val description: Int) {
    Personal(R.string.category_personal),
    Work(R.string.category_work);

    companion object {
        @TypeConverter
        fun getCategory(ordinal: Int): Category {
            return values().getOrElse(ordinal) { Personal }
        }

        @TypeConverter
        fun getOrdinal(category: Category): Int {
            return category.ordinal
        }
    }
}
