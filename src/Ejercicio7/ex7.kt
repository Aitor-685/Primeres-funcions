package Ejercicio7

fun main() {
    println("Muy buenas, somos el Departament d’Ensenyament de la Generalitat")
    val alumnos = comprobadorDeValor()

    println("Dime cuántas chicas hay en la clase:")
    val chicas = leerCantidad("chicas", alumnos)

    println("Dime cuántos chicos hay en la clase:")
    val chicos = leerCantidad("chicos", alumnos)

    println("El número total de alumnos de la clase: $alumnos")

    val porcentajeChicas = calcularPorcentaje(chicas, alumnos)
    val porcentajeChicos = calcularPorcentaje(chicos, alumnos)

    println("Porcentaje de chicas: %.2f%%".format(porcentajeChicas))
    println("Porcentaje de chicos: %.2f%%".format(porcentajeChicos))
}

fun comprobadorDeValor(): Int {
    var alumnos: Int
    do {
        println("Introduce cuántos son en clase:")
        alumnos = readIntSafe()

        if (alumnos <= 0) {
            println("ERROR: El número debe ser mayor que 0")
        }
    } while (alumnos <= 0)

    return alumnos
}

fun leerCantidad(tipo: String, alumnos: Int): Int {
    var cantidad: Int
    do {
        cantidad = readIntSafe()

        when {
            cantidad < 0 -> println("ERROR: El número debe ser mayor o igual a 0")
            cantidad > alumnos -> println("ERROR: No puede haber más $tipo que alumnos")
        }
    } while (cantidad < 0 || cantidad > alumnos)

    return cantidad
}

fun calcularPorcentaje(cantidad: Int, alumnos: Int): Double {
    return (cantidad.toDouble() / alumnos.toDouble()) * 100
}

fun readIntSafe(): Int {
    while (true) {
        val input = readln()

        try {
            return input.toInt()
        } catch (e: NumberFormatException) {
            println("ERROR: Debes introducir un número válido.")
        }
    }
}
