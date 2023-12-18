package Lesson_20.tasks

fun main() {

    val username = "Костя"

    val lambdaMessage: () -> Unit = { { it: String -> println("С наступающим Новым Годом, $username!") }(username) }
    lambdaMessage.invoke()

}