package org.example.basicos

fun String.esPalindromoSimple() : Boolean {
    val cleanString = this.replace(" ", "").lowercase()
    return cleanString == cleanString.reversed()
}

fun main() {
    val entrada = readlnOrNull()

    if (entrada.isNullOrBlank())
        println("Entrada vacía")
    else
        println("${if (entrada.esPalindromoSimple()) "Es" else "No es"} palíndromo")
}
