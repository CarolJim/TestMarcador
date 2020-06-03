package com.example.testmarcador.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testmarcador.POJO.Contenido
import com.example.testmarcador.R
import com.example.testmarcador.UI.Contracts
import com.squareup.picasso.Picasso


class MarcadorAdapter : RecyclerView.Adapter<MarcadorAdapter.ViewHolder>() {

    var datosMarcador: MutableList<Contenido>  = ArrayList()
    lateinit var context: Context
    lateinit var presenter : Contracts.Presenter

    fun MarcadorAdapter(supercontenido : MutableList<Contenido>, context: Context, presenter: Contracts.Presenter){
        this.datosMarcador = supercontenido
        this.context = context
        this.presenter = presenter

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = datosMarcador.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.rv_marcador_elements, parent, false))
    }

    override fun getItemCount(): Int {
        return datosMarcador.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val primerLogo = view.findViewById(R.id.iv_equipo) as ImageView
        val primerEquipo = view.findViewById(R.id.tv_equipo) as TextView
        val primerMarcador = view.findViewById(R.id.tv_num1) as TextView
        val segundoMarcador = view.findViewById(R.id.tv_num2) as TextView
        val segundoEquipo = view.findViewById(R.id.tv_equipo2) as TextView
        val segundoLogo = view.findViewById(R.id.iv_equipo2) as ImageView

        fun bind(Contenido: Contenido, context: Context){
            Picasso.get().load(Contenido.local.logo) .resize(50, 50) .centerCrop() .into(primerLogo)
            primerEquipo.text = Contenido.local.titulo
            primerMarcador.text = Contenido.local.marcador
            segundoMarcador.text = Contenido.visitante.marcador
            segundoEquipo.text = Contenido.visitante.titulo
            Picasso.get().load(Contenido.visitante.logo) .resize(50, 50) .centerCrop() .into(segundoLogo)




        }

    }





}