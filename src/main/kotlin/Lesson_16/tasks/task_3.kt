package Lesson_16.tasks

fun main() {

    val user = User("login", "password123")
    val inputPassword = "password123"
    val isPasswordValid = user.validatePassword(inputPassword)

    if (isPasswordValid) println("Пароль корректный")
    else println("Пароль не корректный")
}

class User(
    val username: String,
    private val password: String,
) {

    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}