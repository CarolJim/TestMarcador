package com.example.testmarcador.UI

import com.example.testmarcador.Conection.ApiClient
import com.example.testmarcador.POJO.Deporte
import com.example.testmarcador.POJO.Contenido
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interactor : Contracts.interactor {
    //variable
    private  var presenter : Contracts.Presenter
    var listaContenido = ArrayList<Contenido>()

    constructor(presenter: Contracts.Presenter){
        this.presenter = presenter
    }
    override fun getSuperContenido() {
        val call: Call<Deporte> = ApiClient.getClient.getContenido()
        call.enqueue(object : Callback<Deporte> {
            override fun onResponse(call: Call<Deporte>?, response: Response<Deporte>?) {
                response.toString()
                //listaContenido.addAll(response!!.body()!!.deporte01)
                presenter.showDataMarker(listaContenido)
            }
            override fun onFailure(call: Call<Deporte>?, t: Throwable?) {
                t.toString()
            }
        })
    }

}