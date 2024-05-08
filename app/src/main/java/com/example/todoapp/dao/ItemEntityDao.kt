package com.example.todoapp.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.model.ItemEntity

interface ItemEntityDao {
    @Query("SELECT * FROM item_entity")
    fun getAll(): List<ItemEntity>

    @Insert
    fun insertAll(itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)
}