package Lesson_10.tasks

fun main() {

    println(INPUT_LOGIN)
    val loginUser = readln().toString()
    println(INPUT_PASSWORD)
    val passwordUser = readln().toString()
    validateCreeds(loginUser, passwordUser)

}

const val INPUT_LOGIN = "Введите логин: "
const val INPUT_PASSWORD = "Введите пароль: "
const val INCORRECT_CREEDS = "Логин или пароль недостаточно длинные"

fun validateCreeds(loginUser: String, passwordUser: String) {
    if (loginUser.length < 4 || passwordUser.length < 4) println(INCORRECT_CREEDS)
}