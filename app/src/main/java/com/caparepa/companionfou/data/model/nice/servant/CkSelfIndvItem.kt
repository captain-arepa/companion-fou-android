package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class CkSelfIndvItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null
)