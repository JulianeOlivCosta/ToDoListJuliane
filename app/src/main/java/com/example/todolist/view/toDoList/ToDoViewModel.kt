package com.example.todolist.view.toDoList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.domain.entities.ToDoEntity
import com.example.todolist.domain.useCase.ToDoUseCase
import kotlinx.coroutines.launch

class ToDoViewModel(
    private val toDoUseCase: ToDoUseCase
) : ViewModel() {

    fun insertNewToDoItem(
        toDoTitle: String,
        toDoDescription: String,
        isConcluded: Boolean
    ) {
        viewModelScope.launch {
            val toDoItem = ToDoEntity(
                title = toDoTitle,
                description = toDoDescription,
                isConcluded = isConcluded
            )
            toDoUseCase.insertNewToDoItem(toDoItem)
        }
    }

    fun getAllToDoItems() {
        viewModelScope.launch {
            toDoUseCase.getAllToDoItems()
        }
    }

    fun deleteToDoItem(
        toDoTitle: String,
        toDoDescription: String,
        isConcluded: Boolean
    ) {
        viewModelScope.launch {
            val deleteToDoItem = ToDoEntity(
                title = toDoTitle,
                description = toDoDescription,
                isConcluded = isConcluded
            )
            toDoUseCase.deleteToDoItem(deleteToDoItem)
        }
    }

    fun deleteAllToDoItems() {
        viewModelScope.launch {
            toDoUseCase.deleteAllToDoItems()
        }
    }
}