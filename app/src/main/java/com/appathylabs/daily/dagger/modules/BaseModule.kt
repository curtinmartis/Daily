package com.appathylabs.daily.dagger.modules

import android.arch.lifecycle.Lifecycle
import android.content.Context
import android.content.res.Resources
import com.appathylabs.daily.base.BaseActivity
import com.appathylabs.daily.dagger.annotations.ActivityScope
import dagger.Module
import dagger.Provides
import java.lang.ref.WeakReference

@Module
class BaseModule {
    @Provides
    @ActivityScope
    fun provideContextReference(activity: BaseActivity): WeakReference<Context> {
        return WeakReference(activity)
    }

    @Provides
    @ActivityScope
    fun provideActivityReference(activity: BaseActivity): WeakReference<BaseActivity> {
        return WeakReference(activity)
    }

    @Provides
    @ActivityScope
    fun provideResources(activity: BaseActivity): Resources {
        return activity.resources
    }

    @Provides
    @ActivityScope
    fun provideLifecycle(activity: BaseActivity): Lifecycle {
        return activity.lifecycle
    }
}