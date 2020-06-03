package com.example.testmarcador.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Deporte (
    @Expose
    @SerializedName("deporte 02")
    val deporte02: Deporte02,
    @SerializedName("deporte 01")
    val deporte01: Deporte01
)