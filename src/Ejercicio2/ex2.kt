package Ejercicio2

fun main(){
    var numero1: Int = 0
    var numero2: Int = 0
    println("Hola muy buenas puedes escoger dos numeros:")
    println("Pero recuerde los numero tienen que ser mas grande que 0")
    println("Primer numero:")
    numero1 = readln().toInt()
    println("Segundo numero:")
    numero2 = readln().toInt()

    if (numero1 <= 0|| numero2 <= 0) {
        println("los numeros tienen que ser mas grade que 0")
    }else {
        compararDosNumeros(numero1, numero2)
    }
}

fun compararDosNumeros(numero1: Int , numero2: Int) {
    val resultado: Boolean
    if (numero1 > numero2) {
        resultado = true
        println("El $resultado indica que el numero1 es mas grande que el numero2")
    } else {
        resultado = false
        println("El $resultado indica que el numero1 es mas pequeño que el numero2")
    }
}