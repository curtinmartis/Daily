package com.appathylabs.daily.dagger.components

import com.appathylabs.daily.DailyApplication
import com.appathylabs.daily.dagger.modules.ActivityBindingModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ActivityBindingModule::class])
interface DailyApplicationComponent {
    fun inject(application: DailyApplication): DailyApplication
}
