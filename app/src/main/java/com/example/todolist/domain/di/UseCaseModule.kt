package com.example.todolist.domain.di

import com.example.todolist.domain.useCase.ToDoListUseCaseImpl
import com.example.todolist.domain.useCase.ToDoUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory<ToDoUseCase> {
        ToDoListUseCaseImpl(
            repository = get()
        )
    }
}