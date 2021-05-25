package com.example.todolist

import com.example.todolist.data.di.dataModule
import com.example.todolist.domain.di.domainModule
import com.example.todolist.view.di.presentationModule
import org.koin.core.context.loadKoinModules

object TaskListFeature {
    fun initKoinModules() {
        loadKoinModules(domainModule + presentationModule + dataModule)
    }
}