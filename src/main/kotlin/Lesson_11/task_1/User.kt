package Lesson_11.task_1

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

    val printInfoAboutUser = printInfoAboutUser(id, login, password, email)
}

fun printInfoAboutUser(id: Int, login: String, password: String, email: String) {
    println("Информация о пользователе №$id\n$login\n$password\n$email")
}