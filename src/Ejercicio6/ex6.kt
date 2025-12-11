package Ejercicio6

fun isEligibleForVipOrBigPurchase(isVip: Boolean, amount: Double): Boolean {
    return isVip || amount > 200.0
}

fun applyNormalDiscount(price: Double): Double {
    return price * 0.8
}

fun applyBlackFridayDiscount(price: Double): Double {
    return price * 0.5
}

fun calculateFinalPrice(
    originalPrice: Double,
    isVip: Boolean,
    isBlackFridayWeek: Boolean
): Double {
    return if (isBlackFridayWeek) {
        applyBlackFridayDiscount(originalPrice)
    } else {
        if (isEligibleForVipOrBigPurchase(isVip, originalPrice)) {
            applyNormalDiscount(originalPrice)
        } else {
            originalPrice
        }
    }
}

fun readDouble(prompt: String): Double {
    while (true) {
        print(prompt)
        val input = readLine()?.trim()
        try {
            return input!!.toDouble()
        } catch (e: Exception) {
            println("Error: Si us plau, introdueix un número vàlid.")
        }
    }
}

fun readYesNo(prompt: String): Boolean {
    while (true) {
        print(prompt)
        when (readLine()?.trim()?.lowercase()) {
            "s", "sí", "si", "yes", "y" -> return true
            "n", "no", "nó" -> return false
            else -> println("Si us plau respon amb 's' (sí) o 'n' (no).")
        }
    }
}

fun main() {
    println()
    println("Benvingut/da a The Bike House!")
    println("Calculadora de descomptes")
    println("=====================================")

    val price = readDouble("Introdueix el preu total de la compra (€): ")
    val isVip = readYesNo("És client VIP? (s/n): ")
    val isBlackFriday = readYesNo("És la setmana de Black Friday? (s/n): ")

    val finalPrice = calculateFinalPrice(price, isVip, isBlackFriday)

    println("=====================================")
    println("Preu original: %.2f €".format(price))

    when {
        isBlackFriday -> {
            println("Descompte aplicat: 50% (Black Friday)")
        }
        isEligibleForVipOrBigPurchase(isVip, price) -> {
            println("Descompte aplicat: 20% (VIP o compra > 200€)")
        }
        else -> {
            println("Descompte aplicat: Cap")
        }
    }

    println("Preu final a pagar: %.2f €".format(finalPrice))
    println()
    println("Gràcies per la teva visita!")
}