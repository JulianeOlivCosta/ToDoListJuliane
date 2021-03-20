package com.example.todolist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todolist.domain.entities.ToDoEntity

@Dao
interface ToDoDAO {

    @Insert
    suspend fun insertToDoItem(ToDoItem: ToDoEntity): Long

    @Update
    suspend fun updateToDoItems(ToDoItem: List<ToDoEntity?>)

    @Delete
    suspend fun deleteToDoItem(ToDoItem: ToDoEntity)

    @Query("DELETE FROM toDo_data_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM toDo_data_table")
    fun getAllToDoItems(): LiveData<List<ToDoEntity>>
}