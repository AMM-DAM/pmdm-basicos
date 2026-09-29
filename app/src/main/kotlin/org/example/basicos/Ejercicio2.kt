package org.example.basicos

private fun leeNota(): Double {
    print("Introduce nota: ")
    val entrada: String = readln()
    val nota: Double? = entrada.toDoubleOrNull()

    if (nota == null || nota > 10.0 || nota < 0.0)
        throw IllegalArgumentException("Nota no válida")

    return nota
}

private fun calificacion(nota: Double): String {
    return when {
        nota < 5 -> "Suspenso"
        nota < 7 -> "Aprobado"
        nota < 9 -> "Notable"
        else -> "Sobresaliente"
    }
}

fun main() {
    val nota = leeNota()
    println("Calificación: ${calificacion(nota)}")
}
