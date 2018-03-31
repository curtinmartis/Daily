package com.appathylabs.daily.tasks

import android.arch.lifecycle.Lifecycle
import com.appathylabs.daily.base.BasePresenter
import com.appathylabs.daily.dagger.annotations.ActivityScope
import javax.inject.Inject

@ActivityScope
class TasksPresenter @Inject constructor(model: TasksModel, view: TasksView, lifecycle: Lifecycle)
    : BasePresenter<TasksModel, TasksView>(model, view, lifecycle)
