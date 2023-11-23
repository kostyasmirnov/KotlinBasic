package Lesson_7.tasks

fun main() {

    println(LENGTH_PASSWORD_FROM_USER)
    var passwordLength = readln().toInt()
    if (passwordLength < 6) passwordLength = 6
    var password: String = ""
    var charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    for (i in 1..passwordLength) {
        password += charset.random()
    }
    println("Сгенерированный пароль: $password")

}

const val LENGTH_PASSWORD_FROM_USER = "Укажите максимальную длину пароля: "