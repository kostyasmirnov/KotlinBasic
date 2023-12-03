package Lesson_13.tasks

fun main() {

    val contact = PhoneDirectory("Kostya", 89652979037, null)
    println("${contact.company}")

}

class PhoneDirectory(
    val name: String,
    val numberPhone: Long,
    val company: String?,
)