package com.example.testmarcador.POJO

import com.google.gson.annotations.SerializedName

data class Deporte02 (
    @SerializedName("contenido")
    val contenido: List<Contenido>
)