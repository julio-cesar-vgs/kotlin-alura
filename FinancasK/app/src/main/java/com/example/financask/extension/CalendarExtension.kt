package com.example.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataDataBrasileiro(): String {
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro)
    return format.format(this.time)

}