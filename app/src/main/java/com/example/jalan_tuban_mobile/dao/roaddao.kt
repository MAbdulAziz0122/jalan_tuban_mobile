package com.example.jalan_tuban_mobile.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.jalan_tuban_mobile.model.road
import java.util.concurrent.Flow


@Dao
interface roaddao {
    @Query("SELECT * FROM road_table ORDER BY name ASC")
    fun getAllroad(): kotlinx.coroutines.flow.Flow<List<road>>

    @Insert
    suspend fun insertroad(road: road)

    @Delete
    suspend fun deleteroad(road: road)

    @Update fun updateroad(road: road)
}