package _1_variaveis

fun main(){
    try {
        print("Digite seu nome: ")
        val name = readln()

        print("Digite sua idade: ")
        val age = readln().toInt()

        print("Digite seu peso: ")
        val weight = readln().toDouble()

        println("Nome: $name, Idade: $age, Peso: $weight")
    } catch (e: NumberFormatException){
        print(e)
    }

}