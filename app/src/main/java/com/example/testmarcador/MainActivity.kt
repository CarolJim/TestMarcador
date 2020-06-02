package com.example.testmarcador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testmarcador.Adapter.MarcadorAdapter
import com.example.testmarcador.POJO.Contenido
import com.example.testmarcador.UI.Contracts
import com.example.testmarcador.UI.Interactor

class MainActivity : AppCompatActivity(), Contracts.Presenter {

    lateinit var recyclerView: RecyclerView
    val mAdapter : MarcadorAdapter = MarcadorAdapter()
    private lateinit var interactor: Contracts.interactor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        interactor = Interactor(this)
        initViews()
    }

    override fun initViews() {
        recyclerView = findViewById(R.id.rv_puntos) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter
        interactor.getSuperContenido()
    }

    override fun showDataMarker(listaContenido: ArrayList<Contenido>) {
        mAdapter.MarcadorAdapter(listaContenido,this,this)
        recyclerView.adapter = mAdapter

    }


}

