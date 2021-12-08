package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.Contact

class ContatoAdapter(private val itens:List<Contact>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContatoViewHolder(inflater.inflate(R.layout.layout_item_contato,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ContatoViewHolder -> holder.bind(itens[position])
        }
    }

    override fun getItemCount() = itens.size
}

class ContatoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val imageDoItem:ImageView = view.findViewById(R.id.imagem_do_item)
    private val tituloNomeDoContato: TextView = view.findViewById(R.id.titulo_nome_do_contato)
    private val subtituloNomeDocontato: TextView = view.findViewById(R.id.subtitulo_nome_do_contato)

    fun bind (item:Contact){
        Glide.with(imageDoItem.context).load(item.image).into(imageDoItem)
        tituloNomeDoContato.text = item.name
        subtituloNomeDocontato.text = item.type.toString()
    }
}
