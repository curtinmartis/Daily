package com.appathylabs.daily.tasks

import com.appathylabs.daily.base.BaseView
import com.appathylabs.daily.dagger.annotations.ActivityScope
import javax.inject.Inject

@ActivityScope
class TasksView @Inject constructor() : BaseView() {
    override fun destroy() {

    }
}