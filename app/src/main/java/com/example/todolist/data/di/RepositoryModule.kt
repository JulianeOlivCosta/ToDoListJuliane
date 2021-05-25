package com.example.todolist.data.di

import com.example.todolist.repository.TaskRepository
import com.example.todolist.repository.TaskRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<TaskRepository> {
        TaskRepositoryImpl(
            taskDao = get()
        )
    }
}