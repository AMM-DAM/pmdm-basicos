package org.example.basicos

fun leeNumero(): Double {
    val entrada = readlnOrNull()
    val numero = entrada?.toDoubleOrNull() ?: throw IllegalArgumentException("Numero invalido")
    return numero
}

fun celsiusAFahrenheit() {
    print("Introduce temperatura: ")
    val celsius = leeNumero()
    val fahrenheit = celsius * 9 / 5 + 32
    println("Resultado: $celsius C° => $fahrenheit F°")
}

fun fahrenheitACelsius() {
    print("Introduce temperatura: ")
    val fahrenheit = leeNumero()
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Resultad: $fahrenheit F° => $celsius C°")
}

fun menu() {
    var salir = false

    do {
        print(
            """
        1) Celsius a Fahrenheit
        2) Fahrenheit a Celcius
        3) Salir
        Elige opcion: 
        """.trimIndent()
        )

        when (readlnOrNull()) {
            "1" -> celsiusAFahrenheit()
            "2" -> fahrenheitACelsius()
            "3" -> salir = true
            else -> println("Opcion no valida.\n")
        }
    } while (!salir)
}

fun main() {
    menu()
}