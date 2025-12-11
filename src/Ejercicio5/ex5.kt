package Ejercicio5

fun main() {
    println("Muy buenos dias usuario, necesito algo para iniciar el codigo")

    val numero = comprobadorDeValor()

    println("Has escogido el numero: $numero")
    println("Muchas gracias por todo, que tenga buen dia.")
}


fun comprobadorDeValor(): Int {
    var numero: Int
    var valido = false

    do {
        println("Introduce un numero positivo y entre 0 y 10:")
        numero = readln().toInt()

        if (numero > 0 && numero < 10){
            println("El numero esta dentro del rango")
            valido = true
        } else {
            println("ERROR: El numero esta fuera del rango permitido")
        }

    } while (!valido)

    return numero
}
