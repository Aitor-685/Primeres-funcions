package Ejercicio1

fun main(){
    var numero: Int = 0
    println("Hola muy buenas puede escoger un numero:")
    println("Pero recuerde ese numero tiene que ser mas grande que 0")
    numero = readln().toInt()

    if (numero <= 0) {
        println("El numero tiene que ser mas grade que 0")
    } else {
        cuadrado(numero)
    }
}

fun cuadrado(numero: Int) {
    var resultado: Int = numero * numero
    println("El cuadrado del numero $numero es: $resultado")
}