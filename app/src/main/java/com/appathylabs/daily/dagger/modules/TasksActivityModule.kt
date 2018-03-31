package com.appathylabs.daily.dagger.modules

import com.appathylabs.daily.base.BaseActivity
import com.appathylabs.daily.dagger.annotations.ActivityScope
import com.appathylabs.daily.tasks.TasksActivity
import dagger.Module
import dagger.Provides

@Module
class TasksActivityModule {
    @Provides
    @ActivityScope
    fun provideActivity(activity: TasksActivity): BaseActivity {
        return activity
    }
}