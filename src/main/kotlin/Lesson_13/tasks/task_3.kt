package Lesson_13.tasks

fun main() {

    val contacts = listOf(
        PhoneDirectory3("Kostya", 8965345037),
        PhoneDirectory3("Anna", 89652345537),
        PhoneDirectory3("Victor", 894565679037, "Google"),
        PhoneDirectory3("Vasya", 892179037, null),
        PhoneDirectory3("Kolya", 890959637, "null"),
    )

    val companies = contacts.mapNotNull { it.company }
    println("Список существующих компаний: $companies")

}

class PhoneDirectory3(
    private val name: String,
    private val numberPhone: Long,
    var company: String? = null,
)