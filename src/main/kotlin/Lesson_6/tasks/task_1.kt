package Lesson_6.tasks

fun main() {

    println(WELCOME_MESSAGE_LOGIN)
    val login = readln()
    println(WELCOME_MESSAGE_PASSWORD)
    val password: String = readln()

    do {
        println(INPUT_LOGIN)
        val enteredLogin = readln()
        println(INPUT_PASSWORD)
        val enteredPassword = readln()

        val isLoginError  = enteredLogin != login || enteredPassword != password
        if (isLoginError) println("Такого пользователя не существует. Попробуйте еще раз+\n")
        else println("Авторизавция прошла успешно")

    } while (isLoginError)

}

const val WELCOME_MESSAGE_LOGIN: String = "Укажите логин:"
const val WELCOME_MESSAGE_PASSWORD: String = "Укажите пароль:"

const val INPUT_LOGIN: String = "Введите зарегистрированный ранее логин"
const val INPUT_PASSWORD: String = "Введите зарегистрированный ранее пароль"
