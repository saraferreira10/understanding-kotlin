package _6_funcoes

fun main () {
    println(modifyString("Rebeca", true))
}

fun modifyString (text: String, uppercase: Boolean = false): String {
    val sb = StringBuilder()

    for (i in text.indices) {
        sb.append("${text.get(i)} ")
    }

    var str = sb.toString()
    if (uppercase) {str = sb.toString().uppercase()}

    return str
}