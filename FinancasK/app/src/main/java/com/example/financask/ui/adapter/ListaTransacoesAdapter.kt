package com.example.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financask.R
import com.example.financask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat

class ListaTransacoesAdapter(
    transacoes: List<Transacao>,
    context: Context
) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context

    /**
     * Cria um item de navegacao de uma tela para a outra
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewCreate = LayoutInflater.from(context)
            .inflate(R.layout.transacao_item, parent, false)

        val transacao = transacoes[position]

        viewCreate.transacao_valor.text = transacao.valor.toString()
        viewCreate.transacao_categoria.text = transacao.categoria


        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        val dataFormatada = format.format(transacao.data.time)
        viewCreate.transacao_data.text = dataFormatada

        return viewCreate
    }

    override fun getItem(position: Int) = transacoes.get(position)

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount() = transacoes.size
}