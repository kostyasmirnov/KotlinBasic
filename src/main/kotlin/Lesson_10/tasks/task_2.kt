package Lesson_10.tasks

fun main() {

    println(INPUT_LOGIN)
    val loginUser = readln().toString()
    println(INPUT_PASSWORD)
    val passwordUser = readln().toString()
    if (validateCreeds(loginUser, passwordUser)) {
        println(INCORRECT_CREEDS)
    }

}

fun validateCreeds(loginUser: String, passwordUser: String): Boolean =
    MAX_LENGTH_FOP_CREEDS > loginUser.length || MAX_LENGTH_FOP_CREEDS > passwordUser.length


const val INPUT_LOGIN = "Введите логин: "
const val INPUT_PASSWORD = "Введите пароль: "
const val INCORRECT_CREEDS = "Логин или пароль недостаточно длинные"
const val MAX_LENGTH_FOP_CREEDS: Int = 4