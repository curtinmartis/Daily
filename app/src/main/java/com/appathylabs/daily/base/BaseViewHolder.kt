package com.appathylabs.daily.base

import android.support.v7.widget.RecyclerView
import android.view.View
import butterknife.ButterKnife

open class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    init {
        ButterKnife.bind(this, view)
    }

}
