package _3_condicionais

import java.text.DecimalFormat
import java.lang.NumberFormatException

fun main(){
    var num1 : Double = 0.0
    val df = DecimalFormat("#.##")

   try {
       print("Digite um número: ")
       num1 = readln().replace(",", ".").toDouble()

       if(num1 > 10){
           num1 = 10.0
       }

       println("$num1 * $num1 = ${df.format((num1 * num1))}")
   } catch (e: NumberFormatException){
       println("Apenas números!")
   }
}