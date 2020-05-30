package com.example.testmarcador.Model

data class DatosMarcador (

    var id : String,
    var tipo : String,
    var local : Array<EquipoLocal>,
    var visitante : Array<EquipoVisitante>,
    var desc1: String,
    var desc2: String,
    var detalle: String,
    var contenido: String,
    var tipocontenido: String,
    var desc3: String,
    var desc3color: String,
    var key: String

)
