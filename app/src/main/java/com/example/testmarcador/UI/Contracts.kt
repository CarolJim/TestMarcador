package com.example.testmarcador.UI

import com.example.testmarcador.POJO.Contenido

class Contracts {

    interface Presenter{
        fun initViews()
        fun showDataMarker(listaContenido : ArrayList<Contenido>)

    }

    interface interactor {
        fun getSuperContenido()
    }
}