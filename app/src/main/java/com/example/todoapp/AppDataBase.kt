package com.example.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapp.dao.ItemEntityDao
import com.example.todoapp.model.ItemEntity

@Database(
    entities = [ItemEntity::class],
    version = 1)
abstract class AppDataBase:RoomDatabase() {
    abstract fun intemEntityDao(): ItemEntityDao
}