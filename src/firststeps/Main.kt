package firststeps

fun main(){

    //definindo variáveis
    val counter: Int
    counter = 10

    //declarando a variável e atribuindo valor
    var decCounter: Int = 10

    //inferência de tipo
    val infCounter = 10.5

    val soma = sum(10, 5)

    println(soma)

}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}