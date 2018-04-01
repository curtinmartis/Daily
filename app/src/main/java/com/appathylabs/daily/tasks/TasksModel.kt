package com.appathylabs.daily.tasks

import com.appathylabs.daily.base.BaseModel
import com.appathylabs.daily.dagger.annotations.ActivityScope
import javax.inject.Inject

@ActivityScope
class TasksModel @Inject constructor() : BaseModel {

    override fun destroy() {

    }

}