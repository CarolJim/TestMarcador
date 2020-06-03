package com.example.testmarcador.Interface

import com.example.testmarcador.POJO.Contenido
import com.example.testmarcador.POJO.Deporte
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiInterface {

    @GET("demo001.json")
    fun getContenido(): Call<Deporte>
}