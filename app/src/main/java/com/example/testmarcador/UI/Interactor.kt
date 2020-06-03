package com.example.testmarcador.UI

import com.example.testmarcador.Conection.ApiClient
import com.example.testmarcador.POJO.Deporte
import com.example.testmarcador.POJO.Contenido
import com.example.testmarcador.POJO.Deporte01
import com.example.testmarcador.POJO.Deporte02
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interactor : Contracts.interactor {
    //variable
    private  var presenter : Contracts.Presenter
    var listaContenido = ArrayList<Deporte>()
    lateinit var deporte01 : Deporte01
    lateinit var deporte02 : Deporte02

    constructor(presenter: Contracts.Presenter){
        this.presenter = presenter
    }
    override fun getSuperContenido() {
        val call: Call<Deporte> = ApiClient.getClient.getContenido()
        call.enqueue(object : Callback<Deporte> {
            override fun onResponse(call: Call<Deporte>?, response: Response<Deporte>?) {
                response.toString()
               deporte02=(response!!.body()!!.deporte02)
               deporte01=(response!!.body()!!.deporte01)
                presenter.showDataMarker(deporte01,deporte02)
            }
            override fun onFailure(call: Call<Deporte>?, t: Throwable?) {
                t.toString()
            }
        })
    }

}