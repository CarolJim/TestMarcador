package com.example.testmarcador.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testmarcador.Model.DatosMarcador
import com.example.testmarcador.R


class MarcadorAdapter : RecyclerView.Adapter<MarcadorAdapter.ViewHolder>() {

    var datosMarcador: MutableList<DatosMarcador>  = ArrayList()
    lateinit var context: Context

    fun MarcadorAdapter(superheros : MutableList<DatosMarcador>, context: Context){
        this.datosMarcador = datosMarcador
        this.context = context
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
        val fecha = view.findViewById(R.id.fecha) as TextView
        val primerLogo = view.findViewById(R.id.iv_equipo) as ImageView
        val primerEquipo = view.findViewById(R.id.tv_equipo) as TextView
        val primerMarcador = view.findViewById(R.id.tv_num1) as TextView
        val segundoMarcador = view.findViewById(R.id.tv_num2) as TextView
        val segundoEquipo = view.findViewById(R.id.tv_equipo2) as TextView
        val segundoLogo = view.findViewById(R.id.iv_equipo2) as ImageView



        fun bind(datosMarcador: DatosMarcador, context: Context){
            fecha.text = "Viernes 29 Mayo"
            primerLogo.text = datosMarcador.local.get(0)
            primerEquipo.text = datosMarcador.local[1]
            itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, superhero.superhero, Toast.LENGTH_SHORT).show() })
            avatar.loadUrl(superhero.photo)
        }
        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }





}