package com.appathylabs.daily.dagger.modules

import com.appathylabs.daily.dagger.annotations.ActivityScope
import com.appathylabs.daily.tasks.TasksActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = [BaseModule::class, TasksActivityModule::class])
    @ActivityScope
    internal abstract fun tasksActivity(): TasksActivity
}