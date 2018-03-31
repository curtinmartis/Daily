package com.appathylabs.daily.tasks

import android.os.Bundle
import com.appathylabs.daily.R
import com.appathylabs.daily.base.BaseActivity
import javax.inject.Inject

class TasksActivity : BaseActivity() {

    @Inject lateinit var presenter: TasksPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks_activity)
    }

}