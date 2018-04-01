package com.appathylabs.daily.base

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

open class BasePresenter<out M: BaseModel, out V: BaseView>(protected val model: M,
                                                            protected val view: V,
                                                            private val lifecycle: Lifecycle) : LifecycleObserver {

    init {
        @Suppress("LeakingThis")
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        view.create()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        model.destroy()
        view.destroy()
        lifecycle.removeObserver(this)
    }

}