package com.example.todolist.data.di

import com.example.todolist.repository.ToDoRepositoryImpl
import com.example.todolist.repository.TodoRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<TodoRepository> {
        ToDoRepositoryImpl(
            toDoDao = get()
        )
    }
}