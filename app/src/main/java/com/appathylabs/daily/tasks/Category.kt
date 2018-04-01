package com.appathylabs.daily.tasks

import android.support.annotation.StringRes
import com.appathylabs.daily.R

enum class Category(@StringRes val description: Int) {
    Personal(R.string.category_personal),
    Work(R.string.category_work)
}
