package com.example.todolist.view.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.FragmentToDoBinding
import com.example.todolist.view.tasks.adapter.TaskAdapter

class ToDoFragment : Fragment() {

    private val binding by lazy {
        FragmentToDoBinding.inflate(layoutInflater)
    }
    private val adapter by lazy { TaskAdapter() }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
        setupAdapter(binding.recyclerViewTodoItem)

    }

    private fun setupAdapter(recyclerView: RecyclerView) {
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter
    }

    companion object {
        fun newInstance() = ToDoFragment()
    }

}