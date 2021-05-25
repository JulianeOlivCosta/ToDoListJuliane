package com.example.todolist.view.di

import com.example.todolist.view.tasks.ToDoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val toDoListModule = module {
    viewModel {
        ToDoViewModel(
            taskUseCase = get()
        )
    }
}