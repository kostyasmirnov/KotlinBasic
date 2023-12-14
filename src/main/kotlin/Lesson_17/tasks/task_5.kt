package Lesson_17.tasks

fun main() {

    val user1 = User("testik19", "1231")
    user1.passwordUser
    user1.passwordUser = "privetKakDela"
    user1.loginUser = "19testik"
}

class User(
    private val login: String,
    private val password: String,
) {

    var loginUser = login
        set(value) {
            field = value
            println("Логин успешно изменен на $field")
        }

    var passwordUser: String
        get() = println("*".repeat(password.length)).toString()
        set(value) {
            return println("Вы не можете изменить пароль")
        }

}