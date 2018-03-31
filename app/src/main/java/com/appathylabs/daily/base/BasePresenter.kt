package com.appathylabs.daily.base

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import java.lang.ref.WeakReference

open class BasePresenter<out M: BaseModel, out V: BaseView>(protected val model: M,
                                                            protected val view: V,
                                                            private val lifecycle: Lifecycle) : LifecycleObserver {

    @Suppress("LeakingThis")
    private var lifecycleListener: LifecycleListener? = LifecycleListener(this)

    init {
        lifecycleListener?.let(lifecycle::addObserver)
    }

    private fun destroy() {
        model.destroy()
        view.destroy()
        lifecycleListener?.let(lifecycle::removeObserver)
        lifecycleListener = null
    }

    class LifecycleListener(presenter: BasePresenter<BaseModel, BaseView>) : LifecycleObserver {
        private val presenterRef = WeakReference(presenter)

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onDestroy() {
            presenterRef.get()?.destroy()
        }
    }

}