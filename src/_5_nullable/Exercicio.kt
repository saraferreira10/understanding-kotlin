package _5_nullable

fun main () {

    val senha: String? = "kljkl"
    val defaultValue = senha?: "1234"
    var maskSenha = "".padEnd(defaultValue.length, '*')

    print(maskSenha)
}