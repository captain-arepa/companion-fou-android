package com.caparepa.companionfou.data.model.general.attribute


import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class RelationDetail(
    @Id var id: Long = 0,
    @SerializedName("human")
    val human: Int? = null,
    @SerializedName("sky")
    val sky: Int? = null,
    @SerializedName("earth")
    val earth: Int? = null,
    @SerializedName("star")
    val star: Int? = null,
    @SerializedName("beast")
    val beast: Int? = null
)