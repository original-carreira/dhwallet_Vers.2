package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContatoAdapter
import com.digitalhouse.dhwallet.model.Contact
import com.digitalhouse.dhwallet.model.ContactType

class TelaTransferirFragment : Fragment(R.layout.fragment_tela_transferir) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaContatos = MutableList(10){
            Contact(
                image = "https://upload.wikimedia.org/wikipedia/pt/8/80/He-Man_e_Gato_Guerreiro.jpg",
                name = "Cibele",
                type = ContactType.AMIGA
            )
        }
        val recycler = view.findViewById<RecyclerView>(R.id.recycler_tela_fragment)
        recycler.adapter = ContatoAdapter(listaContatos)
    }

}