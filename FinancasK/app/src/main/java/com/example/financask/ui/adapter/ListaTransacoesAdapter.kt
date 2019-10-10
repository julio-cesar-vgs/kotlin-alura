package com.example.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import com.example.financask.R
import com.example.financask.extension.formataDataBrasileiro
import com.example.financask.extension.formataParaReal
import com.example.financask.model.Tipo
import com.example.financask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

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


        if (transacao.tipo == Tipo.RECEITAS) {
            viewCreate.transacao_valor.setTextColor(
                ContextCompat.getColor(
                    context,
                    R.color.receita
                )
            )
            viewCreate.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_receita)
        } else {
            viewCreate.transacao_valor.setTextColor(
                ContextCompat.getColor(
                    context,
                    R.color.despesa
                )
            )
            viewCreate.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_despesa)
        }




        viewCreate.transacao_valor.text = transacao.valor.formataParaReal()
        viewCreate.transacao_categoria.text = transacao.categoria
        viewCreate.transacao_data.text = transacao.data.formataDataBrasileiro()

        return viewCreate
    }


    override fun getItem(position: Int) = transacoes.get(position)

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount() = transacoes.size


}