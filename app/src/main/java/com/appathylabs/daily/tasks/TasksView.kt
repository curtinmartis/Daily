package com.appathylabs.daily.tasks

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import butterknife.BindView
import com.appathylabs.daily.R
import com.appathylabs.daily.base.BaseActivity
import com.appathylabs.daily.base.BaseView
import com.appathylabs.daily.dagger.annotations.ActivityScope
import java.lang.ref.WeakReference
import javax.inject.Inject

@ActivityScope
class TasksView @Inject constructor(private val activityRef: WeakReference<BaseActivity>,
                                    private val adapter: TasksAdapter) : BaseView(activityRef) {

    @BindView(R.id.task_list) lateinit var taskList: RecyclerView

    override fun layoutResId() = R.layout.tasks_activity

    override fun create() {
        super.create()
        activityRef.get()?.let {
            taskList.layoutManager = LinearLayoutManager(it, LinearLayoutManager.VERTICAL, false)
            taskList.adapter = adapter
        }
    }

}