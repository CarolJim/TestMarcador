package com.example.testmarcador.POJO

import com.google.gson.annotations.SerializedName

data class Deporte01(
    @SerializedName("contenido")
    val contenido: ArrayList<Contenido>
)
