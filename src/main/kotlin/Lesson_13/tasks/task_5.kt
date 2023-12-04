package Lesson_13.tasks


fun main() {

    val numberPhone: Long
    try {
        val strNumber: String = readln()
        numberPhone = strNumber.toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }

}