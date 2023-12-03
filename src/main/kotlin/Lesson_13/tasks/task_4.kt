package Lesson_13.tasks

import java.util.*

fun main() {

    val contacts: MutableList<PhoneDirectory4> = mutableListOf()
    var inputStop: String = ""

    do {
        val contact = createContact()
        contacts.add(contact!!)
        println(IS_AGAIN)
        inputStop = readln().lowercase(Locale.getDefault())
    } while (inputStop.lowercase(Locale.getDefault()) != "стоп")

    contacts.forEach { println(it.printDirectory()) }

}

class PhoneDirectory4(
    private val name: String?,
    private val numberPhone: Long?,
    private var company: String?,
) {
    fun printDirectory(): String {
        return ("- Имя: $name\n- Номер: $numberPhone\n- Компания: $company\n")
    }
}

fun createContact(): PhoneDirectory4? {
    println("Введите имя: ")
    val inputName = readln()

    println("Введите номер телефона: ")
    var numberPhone = readln().toLongOrNull() ?: return null
    if (numberPhone == null) println(NULL_PHONE_MESSAGE)

    println("Введите название компании: \nнажмите \"Enter\" если желаете пропустить шаг")
    var company = readln().takeIf { it.isNotEmpty() }

    return PhoneDirectory4(inputName, numberPhone, company)
}

const val NULL_PHONE_MESSAGE = "Номер телефона не был введен"
const val IS_AGAIN = "Для добавления еще одной записи, введите \"да\"\nДля выхода введите \"стоп\" "