package com.example.financask.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.formataParaReal(): String {
    val formatoBrasileiro = DecimalFormat.getCurrencyInstance(Locale("pt", "BR"))
    val moedaFormatada = formatoBrasileiro.format(this).replace("R$", "R$ ")

    return moedaFormatada
}