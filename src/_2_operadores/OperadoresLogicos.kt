package _2_operadores

fun main() {

    // AND
    println("T && T: ${true && true}")
    println("F && F: ${false && false}")
    println("F && T: ${false && true}")

    // OR
    println()
    println("T || T: ${true || true}")
    println("F || F: ${false || false}")
    println("F || T: ${false || true}")

    // NOT
    println()
    println("NOT F: ${!false}")
    println("NOT T: ${!true}")

}