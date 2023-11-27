package Lesson_10.tasks

fun main() {

    println(INPUT_LOGIN)
    val loginUser = readln().toString()
    println(INPUT_PASSWORD)
    val passwordUser = readln().toString()
    isValidateCreeds(loginUser, passwordUser)

}

fun isValidateCreeds(loginUser: String, passwordUser: String): Boolean {
    val result = if (loginUser.length < MAX_LENGTH_FOP_CREEDS || passwordUser.length < MAX_LENGTH_FOP_CREEDS) {
        println(INCORRECT_CREEDS)
        return false
    } else return true

    return result
}

const val INPUT_LOGIN = "Введите логин: "
const val INPUT_PASSWORD = "Введите пароль: "
const val INCORRECT_CREEDS = "Логин или пароль недостаточно длинные"
const val MAX_LENGTH_FOP_CREEDS: Int = 4