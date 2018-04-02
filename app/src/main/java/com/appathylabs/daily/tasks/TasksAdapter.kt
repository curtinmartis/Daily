package com.appathylabs.daily.tasks

import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.appathylabs.daily.R
import com.appathylabs.daily.dagger.annotations.ActivityScope
import com.appathylabs.daily.room.entities.Category.Personal
import com.appathylabs.daily.room.entities.Category.Work
import com.appathylabs.daily.room.entities.Task
import java.text.DateFormat
import java.util.*
import javax.inject.Inject

@ActivityScope
class TasksAdapter @Inject constructor(resources: Resources) : RecyclerView.Adapter<TaskViewHolder>() {

    private val cardPaddingPx = resources.getDimensionPixelSize(R.dimen.card_padding)
    private val dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM)

    var tasks: List<Task> = listOf(
            Task("Task 1", Personal, Date()),
            Task("Task 2", Work, GregorianCalendar().apply { set(2018, 2, 30, 4, 30) }.time)
    )
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_card, parent, false)
        return TaskViewHolder(view, dateFormat)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        applyCardPadding(holder, position)
        tasks[position].let(holder::bind)
    }

    override fun getItemCount() = tasks.size

    private fun applyCardPadding(holder: TaskViewHolder, position: Int) {
        val topPadding = if (position == 0) cardPaddingPx else 0
        val layoutParams = holder.itemView.layoutParams as RecyclerView.LayoutParams
        layoutParams.setMargins(cardPaddingPx, topPadding, cardPaddingPx, cardPaddingPx)
    }

}
