package com.appathylabs.daily.room.dao

import android.arch.persistence.room.Dao
import android.support.annotation.Keep
import com.appathylabs.daily.room.entities.Category

@Keep
@Dao
interface CategoriesDao {
    fun addCategory(category: Category)
    fun getCategory(ordinal: Int): Category
    fun getAllCategories()
}
