package com.example.todolist.view.toDoList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.domain.entities.TaskEntity
import com.example.todolist.domain.useCase.TaskUseCase
import kotlinx.coroutines.launch

class ToDoViewModel(
    private val taskUseCase: TaskUseCase
) : ViewModel() {

    fun insertNewToDoItem(
        toDoTitle: String,
        toDoDescription: String,
        isConcluded: Boolean
    ) {
        viewModelScope.launch {
            val toDoItem = TaskEntity(
                title = toDoTitle,
                description = toDoDescription,
                isConcluded = isConcluded
            )
            taskUseCase.insertNewToDoItem(toDoItem)
        }
    }

    fun getAllToDoItems() {
        viewModelScope.launch {
            taskUseCase.getAllToDoItems()
        }
    }

    fun deleteToDoItem(
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

    fun deleteAllToDoItems() {
        viewModelScope.launch {
            taskUseCase.deleteAllToDoItems()
        }
    }
}