package com.appathylabs.daily

import android.app.Activity
import android.app.Application
import com.appathylabs.daily.dagger.components.DaggerDailyApplicationComponent
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class DailyApplication : Application(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerDailyApplicationComponent.builder()
                .build()
                .inject(this)
    }

    override fun activityInjector() = dispatchingActivityInjector

}
