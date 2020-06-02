package com.example.testmarcador.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Deporte (
    @Expose
    @SerializedName("deporte02")
    val deporte02: Deporte02,
    @SerializedName("deporte01")
    val deporte01: Deporte01
)