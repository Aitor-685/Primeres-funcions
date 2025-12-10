package Ejercicio3

fun main(){
    menu()
}

fun menu(){
    var opcion: Int = 0
    do {
        println("Muy buenas usuario listo para calcular el area")
        println("Escoge una de las opciones disponibles")
        println("1. Area del cuadrado")
        println("2. Area del rectangulo")
        println("3. Area del triangulo")
        println("4. Area del circulo")
        println("0. Salir")
        opcion = readln().toInt()

        if (opcion !in 0..5) {
            println("el numero debe ser entre el 1 y el 5")
        } else {
            println("Bien podemos continuar")
        }

        when(opcion){
            1 -> {
                areaDelCuadrado()
            }
            2 -> {
                areaDelRectangulo()
            }
            3 -> {
                areaDelTriangulo()
            }
            4 -> {
                areaDelCirculo()
            }
        }
    }while (opcion != 0)
    println("muchas gracias por todo que tenga un buen dia.")
}

fun areaDelCuadrado(){
    var resultado: Int
    var lado: Int = 0
    println("=== CÁLCULO DEL ÁREA DEL CUADRADO ===")

    println("Introduce un lado del cuadrado:")
    lado = readln().toInt()

    if (lado >= 0) {
        println("Muchas gracias")
    } else {
        println("el numero debe ser mas grande que 0")
    }

    resultado = lado * lado
    println("El area de tu cuadrado es: $resultado")
}

fun areaDelTriangulo(){
    var resultado: Int
    var base: Int = 0
    var altura: Int = 0
    println("=== CÁLCULO DEL ÁREA DEL TRIANGULO ===")

    println("Introduce la base del triangulo:")
    base = readln().toInt()

    println("Introduce la altura del triangulo:")
    altura = readln().toInt()

    if (base >= 0 || altura >= 0) {
        println("Muchas gracias")
    } else {
        println("el numero debe ser mas grande que 0")
    }

    resultado = base * altura / 2
    println("El area de tu triangulo es: $resultado")
}

fun areaDelRectangulo(){
    var resultado: Int
    var base: Int = 0
    var altura: Int = 0
    println("=== CÁLCULO DEL ÁREA DEL RECTANGULO ===")

    println("Introduce la base del rectangulo:")
    base = readln().toInt()

    println("Introduce la altura del rectangulo:")
    altura = readln().toInt()

    if (base >= 0 || altura >= 0) {
        println("Muchas gracias")
    } else {
        println("el numero debe ser mas grande que 0")
        return
    }

    resultado = base * altura
    println("El area de tu rectangulo es: $resultado")
}

fun areaDelCirculo() {
    println("=== CÁLCULO DEL ÁREA DEL CÍRCULO ===")
    print("Introduce el radio del círculo: ")
    val radioStr = readln()
    val radio = radioStr.toDoubleOrNull()

    if (radio == null || radio <= 0) {
        println("Error: El radio debe ser un número positivo mayor que 0.")
    } else {
        val area = Math.PI * radio * radio
        println("El área de tu círculo es: %.4f".format(area))
        println("¡Cálculo realizado con éxito!")
    }
}