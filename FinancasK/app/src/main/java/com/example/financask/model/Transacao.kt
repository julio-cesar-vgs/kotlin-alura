package com.example.financask.model

import java.math.BigDecimal
import java.util.*

class Transacao(
    valor: BigDecimal,
    categoria: String,
    data: Calendar
) {
    private val valor: BigDecimal = valor
    private val categoria: String = categoria
    private val date: Calendar = data

    fun getValor(): BigDecimal {
        return valor
    }


}