package _4_repeticoes

import java.util.Scanner

fun main () {
    val sc: Scanner  = Scanner(System.`in`)
    val num = sc.nextInt()

    println("Op")
    val op = sc.next()[0]
    var controle = 1

    while(controle <= 10){
        System.out.println("$num $op $controle: ${realizarOperacao(op, controle, num)}")
        controle++
    }

    sc.close()

    for (i in 0..10){
        System.out.print("$i ")
    }

    println()

    for (i in 10 downTo 0 step 2){
        System.out.print("$i ")
    }
}

fun realizarOperacao (op: Char, num1: Int, num2: Int) : Int{
    return when(op) {
        '*' -> num1 * num2
        '+' -> num1 + num2
        '-' -> num1 - num2
        '/' -> (num1 / num2)
        else -> throw Exception("escolha uma operação válida")
    }
}