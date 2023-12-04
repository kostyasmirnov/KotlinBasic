package Lesson_13.tasks

import java.util.*

fun main() {

    val numberPhone: Long
    try {
        val strNumber: String = readln()
        numberPhone = strNumber.toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }

}

class PhoneDirectory5(
    private val name: String?,
    private val numberPhone: Long?,
    private var company: String?,
) {
    fun printDirectory(): String {
        return ("- Имя: $name\n- Номер: $numberPhone\n- Компания: $company\n")
    }
}