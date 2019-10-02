package com.example.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financask.R

class ListaTransacoesAdapter(
    transacoes: List<String>,
    context: Context
) : BaseAdapter() {
    private val transacoes = transacoes
    private val context = context

    /**
     * Cria um item de navegacao de uma tela para a outra
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
    }

    override fun getItem(position: Int) = transacoes.get(position)

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount() = transacoes.size
}