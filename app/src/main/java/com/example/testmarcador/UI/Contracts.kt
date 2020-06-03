package com.example.testmarcador.UI

import com.example.testmarcador.POJO.Contenido
import com.example.testmarcador.POJO.Deporte01
import com.example.testmarcador.POJO.Deporte02

class Contracts {

    interface Presenter{
        fun initViews()
        fun showDataMarker( deporte01: Deporte01,deporte02: Deporte02)

    }

    interface interactor {
        fun getSuperContenido()
    }
}