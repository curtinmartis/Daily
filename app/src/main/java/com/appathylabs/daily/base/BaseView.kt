package com.appathylabs.daily.base

import android.support.annotation.CallSuper
import android.support.annotation.LayoutRes
import butterknife.ButterKnife
import butterknife.Unbinder
import java.lang.ref.WeakReference

abstract class BaseView(private val activityRef: WeakReference<BaseActivity>) {

    private var unbinder: Unbinder? = null

    @CallSuper
    open fun create() {
        activityRef.get()?.let {
            it.setContentView(layoutResId())
            unbinder = ButterKnife.bind(this, it)
        }
    }

    @CallSuper
    open fun destroy() {
        unbinder?.unbind()
        unbinder = null
    }

    @LayoutRes abstract fun layoutResId(): Int
}