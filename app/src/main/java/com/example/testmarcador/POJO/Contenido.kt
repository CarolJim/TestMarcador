package com.example.testmarcador.POJO

import com.example.testmarcador.Model.Equipo
import com.google.gson.annotations.SerializedName

data class Contenido (
    @SerializedName("id")
    var id : String,
    @SerializedName("tipo")
    var tipo : String,
    @SerializedName("local")
    var local : Equipo,
    @SerializedName("visitante")
    var visitante : Equipo,
    @SerializedName("desc1")
    var desc1: String,
    @SerializedName("desc2")
    var desc2: String,
    @SerializedName("detalle")
    var detalle: String,
    @SerializedName("contenido")
    var contenido: String,
    @SerializedName("tipocontenido")
    var tipocontenido: String,
    @SerializedName("desc3")
    var desc3: String,
    @SerializedName("desc3color")
    var desc3color: String,
    @SerializedName("key")
    var key: String
)