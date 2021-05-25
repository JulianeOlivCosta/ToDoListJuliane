package com.example.todolist.data.di

import com.example.todolist.data.TaskDataBase
import org.koin.dsl.module

val databaseModule = module {
    single { TaskDataBase.getInstance(get()) }
    single { get<TaskDataBase>().toDoDao() }
}