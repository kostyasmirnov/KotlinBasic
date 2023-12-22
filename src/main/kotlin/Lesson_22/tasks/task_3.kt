package Lesson_22.tasks

fun main() {

    val book = DataBook3("Метро", "Глуховскитй", 1)

    val (name, author, id) = book
    println(book)

}

data class DataBook3(
    val name: String,
    val author: String,
    val id: Int,
)