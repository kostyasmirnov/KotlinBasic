package Lesson_20.tasks

fun main() {

    val username = "Костя"

    { it: String -> println("С наступающим Новым Годом, $username!") }(username)
}