package com.example.todolist.view.tasks.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.TaskItemLayoutBinding
import com.example.todolist.domain.entities.TaskEntity

class TaskAdapter : RecyclerView.Adapter<TaskViewHolder>() {

    private var taskList: List<TaskEntity> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.onBind(taskList, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = TaskItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TaskViewHolder(binding.root)
    }

    override fun getItemCount(): Int = taskList.size
}