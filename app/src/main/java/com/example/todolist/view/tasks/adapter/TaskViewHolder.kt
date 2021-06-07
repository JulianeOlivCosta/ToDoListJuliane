package com.example.todolist.view.tasks.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.R
import com.example.todolist.domain.entities.TaskEntity

class TaskViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    private val taskItemTitle by lazy {
        view.findViewById<TextView>(R.id.text_view_task_item_title)
    }


    private val taskItemDescription by lazy {
        view.findViewById<TextView>(R.id.text_view_task_item_description)
    }

//    private val taskCheckBox by lazy {
//        view.findViewById<CheckBox>(R.id.check_Box_task)
//    }

    fun onBind(
        task: List<TaskEntity>,
        position: Int
    ) {
        taskItemTitle.text = task[position].title
        taskItemDescription.text = task[position].description
    }
}