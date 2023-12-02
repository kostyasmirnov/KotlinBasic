package Lesson_13.tasks

fun main() {

    val contact = PhoneDirectory2("Kostya", 89652979037)
    println("${contact.printDirectory()}")

}

class PhoneDirectory2(
    private val name: String,
    private val numberPhone: Long,
    private var company: String? = null,
) {

    fun printDirectory(): String {
        if (company == null) company = "<не указано>"
        return ("- Имя: $name\n- Номер: $numberPhone\n- Компания: $company")
    }
}