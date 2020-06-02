package com.example.testmarcador.Model

import com.google.gson.annotations.SerializedName

data class Equipo (
    @SerializedName("logo")
    var logo : String,
    @SerializedName("titulo")
    var titulo : String,
    @SerializedName("marcador")
    var marcador: String
)
