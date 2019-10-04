package com.example.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financask.R
import com.example.financask.model.Tipo
import com.example.financask.model.Transacao
import com.example.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*


class ListaTransacoesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
            Transacao(
                tipo = Tipo.DESPESAS,
                data = Calendar.getInstance(),
                valor = BigDecimal(20.5)
            ),
            Transacao(
                valor = BigDecimal(100.0),
                tipo = Tipo.RECEITAS,
                categoria = "Economia"
            ),
            Transacao(
                valor = BigDecimal(200.0),
                tipo = Tipo.DESPESAS
            ),
            Transacao(
                valor = BigDecimal(500.0),
                categoria = "Prêmio",
                tipo = Tipo.RECEITAS
            )
        )




        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}