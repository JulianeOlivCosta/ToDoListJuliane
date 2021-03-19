package com.example.todolist.repository

import com.example.todolist.data.ToDoDAO
import com.example.todolist.domain.entities.ToDoEntity

class ToDoRepository(
    private val toDoDao: ToDoDAO
) {
    val toDoItems = toDoDao.getAllToDoItems()

    suspend fun insert(toDo: ToDoEntity) {
        toDoDao.insertToDoItem(toDo)
    }

    suspend fun update(toDo: ToDoEntity) {
        toDoDao.updateToDoItems(toDo)
    }

    suspend fun delete(toDo: ToDoEntity) {
        toDoDao.deleteToDoItem(toDo)
    }

    suspend fun deleteAll() {
        toDoDao.deleteAll()
    }
}