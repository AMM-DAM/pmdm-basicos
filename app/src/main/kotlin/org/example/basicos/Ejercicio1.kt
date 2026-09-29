package org.example.basicos

import kotlin.text.iterator

private fun leeFraseNoVacia(): String {
    print("Introduce una frase: ")
    val entrada = readln()
    return if (!entrada.isBlank()) entrada else leeFraseNoVacia()
}

private val vocales = arrayOf('a', 'e', 'i', 'o', 'u')
private fun contarVocales(frase: String): Int {
    var num = 0
    for (c in frase) {
        if (c.lowercaseChar() in vocales) {
            num++
        }
    }
    return num
}

private fun contarConsonantes(frase: String): Int {
    var num = 0
    for (c in frase) {
        if (c.lowercaseChar() !in vocales) {
            num++
        }
    }
    return num
}

private fun resumenFrase(frase: String) {
    println(
        """
    --- RESUMEN ---
    Longitud: ${frase.length}
    Vocales: ${contarVocales(frase)}
    Consonantes: ${contarConsonantes(frase)}
    Espacios: ${frase.count { it.isWhitespace() }}
    """.trimIndent()
    )
}

fun main() {
    val frase = leeFraseNoVacia()
    resumenFrase(frase)
}