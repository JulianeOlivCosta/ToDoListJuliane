package com.example.todolist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todolist.domain.entities.TaskEntity

@Dao
interface TaskDAO {

    @Insert
    suspend fun insertToDoItem(taskItem: TaskEntity): Long

    @Update
    suspend fun updateToDoItems(taskItem: List<TaskEntity?>)

    @Delete
    suspend fun deleteToDoItem(taskItem: TaskEntity)

    @Query("DELETE FROM toDo_data_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM toDo_data_table")
    fun getAllToDoItems(): LiveData<List<TaskEntity>>
}