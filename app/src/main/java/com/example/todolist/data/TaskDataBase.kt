package com.example.todolist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todolist.domain.entities.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDataBase : RoomDatabase() {

    abstract fun toDoDao(): TaskDAO

    companion object {
        @Volatile
        private var INSTANCE: TaskDataBase? = null
        fun getInstance(context: Context): TaskDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TaskDataBase::class.java,
                        "todo_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}