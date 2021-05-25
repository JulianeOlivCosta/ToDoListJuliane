package com.example.todolist.domain.di

import com.example.todolist.domain.useCase.TaskListUseCaseImpl
import com.example.todolist.domain.useCase.TaskUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory<TaskUseCase> {
        TaskListUseCaseImpl(
            repository = get()
        )
    }
}