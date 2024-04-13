package _3_condicionais

fun main() {
    print("idade: ")
    val age: Int = readln().toInt()

    val response: String

    // A ESTRUTURA IF É UMA EXPRESSÃO, ENTÃO PODE RETORNAR UM VALOR

    response = if (age <= 12){
        // A ÚLTIMA EXPRESSÃO É RETORNADA
        "CRIANÇA"
    } else if (age <= 17) {
        "ADOLESCENTE"
    } else if (age <= 65) {
        "ADULTO"
    } else {
        "IDOSO"
    }

    println(response)
}