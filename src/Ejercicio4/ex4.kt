package Ejercicio4

fun main(){
    menu()
}

fun menu(){
    var opcion: Int = 0
    do {
        println("Muy buenas usuario listo para calcular")
        println("Escoge una de las opciones disponibles")
        println("1. Suma")
        println("2. Resta")
        println("3. Division")
        println("4. Multiplicacion")
        println("0. Salir")
        opcion = readln().toInt()

        if (opcion !in 0..5) {
            println("el numero debe ser entre el 1 y el 5")
        } else {
            println("Bien podemos continuar")
        }

        when(opcion){
            1 -> {
                suma()
            }
            2 -> {
                resta()
            }
            3 -> {
                division()
            }
            4 -> {
                multiplicacion()
            }
        }
    }while (opcion != 0)
    println("muchas gracias por todo que tenga un buen dia.")
}


fun suma() {
    println("Necesitare dos numeros para la operacion:")
    println("Introduce el primer numero")
    val numero1 = readln().toIntOrNull() ?: 0

    if (numero1 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Puedes continuar")
    }

    println("Introduce el segundo numero")
    var numero2 = readln().toIntOrNull() ?: 0

    if (numero2 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Comensamos con la operacion")
    }

    val resultado = numero1 + numero2
    println("La suma de los numeros $numero1 y $numero2 es: $resultado")
}

fun resta() {
    println("Necesitare dos numeros para la operacion:")
    println("Introduce el primer numero")
    val numero1 = readln().toIntOrNull() ?: 0

    if (numero1 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Puedes continuar")
    }

    println("Introduce el segundo numero")
    var numero2 = readln().toIntOrNull() ?: 0

    if (numero2 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Comensamos con la operacion")
    }

    val resultado = numero1 - numero2
    println("La resta de los numeros $numero1 y $numero2 es: $resultado")
}

fun division() {
    println("Necesitare dos numeros para la operacion:")
    println("Introduce el primer numero")
    val numero1 = readln().toIntOrNull() ?: 0

    if (numero1 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Puedes continuar")
    }

    println("Introduce el segundo numero")
    val numero2 = readln().toIntOrNull() ?: 0

    if (numero2 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Comensamos con la operacion")
    }

    val resultado = numero1 / numero2
    println("La division de los numeros $numero1 y $numero2 es: $resultado")
}

fun multiplicacion() {
    println("Necesitare dos numeros para la operacion:")
    println("Introduce el primer numero")
    val numero1 = readln().toIntOrNull() ?: 0

    if (numero1 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Puedes continuar")
    }

    println("Introduce el segundo numero")
    val numero2 = readln().toIntOrNull() ?: 0

    if (numero2 < 0){
        println("ERROR el numero no puede ser nulo y tiene que ser mas grande que 0")
    } else {
        println("Comensamos con la operacion")
    }

    val resultado = numero1 * numero2
    println("La multiplicar de los numeros $numero1 y $numero2 es: $resultado")
}