package com.example.todolist.repository

import com.example.todolist.data.ToDoDAO
import com.example.todolist.domain.entities.ToDoEntity

class ToDoRepositoryImpl(
    private val toDoDao: ToDoDAO
) : TodoRepository {

    override suspend fun insertToDoItem(toDoItem: ToDoEntity) {
        toDoDao.insertToDoItem(toDoItem)
    }

    override suspend fun updateToDoItems(toDoItems: List<ToDoEntity?>) {
        toDoDao.updateToDoItems(toDoItems)
    }

    override suspend fun deleteToDoItem(toDoItem: ToDoEntity) {
        toDoDao.deleteToDoItem(toDoItem)
    }

    override suspend fun deleteAllToDoItems() {
        toDoDao.deleteAll()
    }

    override suspend fun getAllToDoItems() {
        toDoDao.getAllToDoItems()
    }
}