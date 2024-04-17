package _6_funcoes

import java.util.Scanner

fun main () {
    val sc: Scanner = Scanner(System.`in`)
    val idade = sc.nextInt()

    print(calculaIdadeDeCachoro(idade))

    sc.close()
}

private fun calculaIdadeDeCachoro(idade: Int = 7): Int{
    return idade * 7
}