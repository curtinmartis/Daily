package com.appathylabs.daily.tasks

import com.appathylabs.daily.base.BaseActivity
import javax.inject.Inject

class TasksActivity : BaseActivity() {
    @Inject lateinit var presenter: TasksPresenter
}