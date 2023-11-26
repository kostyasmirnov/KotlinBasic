package Lesson_11.task_1

fun main() {

    val user1: User = User(
        id = 1,
        login = "testik",
        password = "qwerty123",
        email = "testikWork@gmail.com",
    )

    val user2: User = User(
        id = 2,
        login = "pixel",
        password = "stringstring22",
        email = "google@yahoo.com",
    )

    user1.printInfoAboutUser
    println()
    user2.printInfoAboutUser

}