package _3_condicionais

fun main () {
    val x = 20

    when(x) {
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        else -> println("DESCONHECIDO")
    }

    when(x) {
        in 10..20 -> println("ENTRE 10 E 20")
        in 20..30 -> println("ENTRE 20 E 30")
        else -> println("OUTRO INTERVALO")
    }

    val s = when {
        x % 2 == 0 -> "PAR"
        else -> "IMPAR"
    }

    println(s)


}