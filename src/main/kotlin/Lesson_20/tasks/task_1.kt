package Lesson_20.tasks

fun main() {

    val username = "Костя"

    val lambdaMessage: (String) -> Unit = { it: String -> println("С наступающим Новым Годом, $username!") }
    lambdaMessage(username)

}