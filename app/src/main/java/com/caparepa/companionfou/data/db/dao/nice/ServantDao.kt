package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.model.nice.servant.ServantItem

@Dao
interface ServantDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(servant: ServantItem)

    @Query("SELECT * FROM servant")
    suspend fun getServants(): List<ServantItem>

    @Query("SELECT * FROM servant WHERE id = :id")
    suspend fun getServantById(id: Long): ServantItem

    @Query("SELECT * FROM servant WHERE collection_no = :collectionNo")
    suspend fun getServantByCollectionNo(collectionNo: Long): ServantItem

    @Query("SELECT * FROM servant WHERE class_name = :className")
    suspend fun getServantByClass(className: String): List<ServantItem>

    @Query("SELECT * FROM servant WHERE rarity = :rarity")
    suspend fun getServantByRarity(rarity: Int): List<ServantItem>

    @Query("SELECT * FROM servant WHERE type = :servantType")
    suspend fun getServantByType(servantType: String): List<ServantItem>

    @Query("SELECT * FROM servant WHERE class_name = :className OR rarity = :rarity OR type = :servantType")
    suspend fun getServantByFilter(
        className: String,
        rarity: Int,
        servantType: String
    ): List<ServantItem>
}