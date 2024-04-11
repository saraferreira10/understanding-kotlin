package _1_variaveis

fun main(){
    val i1 = 10
    val d1 = i1.toDouble()
    println(d1)

    val d2 = 10.34
    val i2 = d2.toInt()
    println(i2)

    val i3 = 2000
    val b1 = i3.toByte()
    println(b1)

    /*
    dados unsigned - sem sinal
    INT -> UINT
    BYTE -> UBYTE
    SHORT -> USHORT
    LONG -> ULONG
    */
    val x = 100U
    val y = 100UL

    x.toULong()

    val x2 = -200
    val y2 = x2.toUInt()
    println(y2)

    val bl1 = true
    val bl2: Boolean = false

    val c: Char = 'A'
    println(c.plus(2))

    val firstname: String = "Sara"
    val lastname = "Ferreira"

    //val fullname = firstname + lastname

    val fullname = "Full name: $firstname $lastname $x2 ${(firstname + lastname).length}"
    println(fullname)

    println("O rato roeu\na roupa do\nrei de \"Roma\"")

    val s = """
        O rato
        roeu a roupa
        do rei de "Roma"
    """.trimIndent()

    println()
    println(s)

   try {
       print("Digite o seu nome: ")
       val name = readln()

       print("\nDigite sua idade: ")
       val age = readln().toInt()

       println("Seu nome invertido é ${name.reversed()}, sua idade é $age")
   } catch (e: NumberFormatException){
       print("Idade deve ser um número!")
   }

}

const val msg = "HELLO"