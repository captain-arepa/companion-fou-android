package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicMysticCodeItem

@Dao
interface BasicInnerMysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(innerItem: BasicMysticCodeItem)

    @Query("SELECT * FROM basic_mystic_code_item WHERE _id = :id")
    suspend fun getInnerMysticCodeItem(id: Int): BasicMysticCodeItem

}