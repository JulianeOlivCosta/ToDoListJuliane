package com.example.todolist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todolist.domain.entities.ToDoEntity

@Database(entities = [ToDoEntity::class], version = 1)
abstract class ToDoDataBase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDAO

    companion object {
        @Volatile
        private var INSTANCE: ToDoDataBase? = null
        fun getInstance(context: Context): ToDoDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ToDoDataBase::class.java,
                        "todo_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}