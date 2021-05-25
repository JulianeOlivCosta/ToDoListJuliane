package com.example.todolist.view.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.domain.entities.TaskEntity
import com.example.todolist.domain.useCase.TaskUseCase
import kotlinx.coroutines.launch

class ToDoViewModel(
    private val taskUseCase: TaskUseCase
) : ViewModel() {

    fun insertNewTask(
        toDoTitle: String,
        toDoDescription: String
    ) {
        viewModelScope.launch {
            val toDoItem = TaskEntity(
                title = toDoTitle,
                description = toDoDescription
            )
            taskUseCase.insertNewToDoItem(toDoItem)
        }
    }

    fun getAllTasks() {
        viewModelScope.launch {
            taskUseCase.getAllToDoItems()
        }
    }

    fun deleteTask(
        toDoTitle: String,
        toDoDescription: String,
        isConcluded: Boolean
    ) {
        viewModelScope.launch {
            val deleteToDoItem = TaskEntity(
                title = toDoTitle,
                description = toDoDescription,
                isConcluded = isConcluded
            )
            taskUseCase.deleteToDoItem(deleteToDoItem)
        }
    }

    fun deleteAllTasks() {
        viewModelScope.launch {
            taskUseCase.deleteAllToDoItems()
        }
    }
}