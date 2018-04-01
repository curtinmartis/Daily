package com.appathylabs.daily.tasks

import android.view.View
import android.widget.TextView
import butterknife.BindView
import com.appathylabs.daily.R
import com.appathylabs.daily.base.BaseViewHolder
import java.text.DateFormat

class TaskViewHolder(view: View, private val dateFormat: DateFormat) : BaseViewHolder(view) {

    @BindView(R.id.task_title) lateinit var title: TextView
    @BindView(R.id.task_category) lateinit var category: TextView
    @BindView(R.id.task_created_at) lateinit var createdAt: TextView

    fun bind(task: Task) {
        title.text = task.title
        category.setText(task.category.description)
        createdAt.text = dateFormat.format(task.createdAt)
    }

}
