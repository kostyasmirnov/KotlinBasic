package Lesson_7.tasks

fun main() {

    println(LENGTH_PASSWORD_FROM_USER)
    val passwordLength = readln().toInt()
    var password: String = ""
    var charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    for (i in 6..passwordLength) {
        password += charset.random()
    }
    println("Сгенерированный пароль: $password")

}

const val LENGTH_PASSWORD_FROM_USER = "Укажите максимальную длину пароля: "