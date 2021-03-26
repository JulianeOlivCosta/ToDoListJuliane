package com.example.todolist.data.di

import com.example.todolist.data.ToDoDataBase
import org.koin.dsl.module

val databaseModule = module {
    single { ToDoDataBase.getInstance(get()) }
    single { get<ToDoDataBase>().toDoDao() }
}