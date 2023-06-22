package com.example.jalan_tuban_mobile.repository

import com.example.jalan_tuban_mobile.dao.roaddao
import com.example.jalan_tuban_mobile.model.road
import kotlinx.coroutines.flow.Flow

class roadRepository(private val roaddao: roaddao) {
    val allroads: Flow<List<road>> = roaddao.getAllroad()

    suspend fun insertroad(road: road){
        roaddao.insertroad(road)
    }

    suspend fun deleteroad(road: road){
        roaddao.deleteroad(road)
    }

    suspend fun updateroad(road: road){
        roaddao.updateroad(road)
    }
}