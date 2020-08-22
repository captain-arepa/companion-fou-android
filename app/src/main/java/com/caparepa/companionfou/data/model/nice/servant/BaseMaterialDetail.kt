package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class BaseMaterialDetail(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("background")
    val background: String? = null
)