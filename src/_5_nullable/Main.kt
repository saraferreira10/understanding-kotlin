package _5_nullable

fun main () {

    // PODE RECEBER NULL
    var n: Int? = 10
    n = null

    // NÃO PODE RECEBER NULL
    val x = 10
    // x = null

    var s1: String? = null

    // SAFE CALLS
    s1 = s1?.uppercase()

    println(s1)

    val value: Int? = 10

    // SEM ELVIS OPERATOR
    // val value2 = if (value != null) value else 0

    // ELVIS OPERATOR
    val value2 = value?: 0

    println(value2)
}