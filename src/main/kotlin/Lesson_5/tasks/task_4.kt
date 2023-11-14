package Lesson_5.tasks

import kotlin.system.exitProcess

fun main() {

    println(WELCOME_MESSAGE.trimMargin())

    println("\nВведите логин:")
    val userName = readLine()

    if (userName != USER_NAME) {
        println("Такого пользователя не существует. Пожалуйста зарегестрируйтесь")
        exitProcess(0)
    }

    println("\nВведите пароль:")
    val password = readLine()


    if (userName == USER_NAME && password == PASSWORD)
        println(AUTH_MESSAGE.trimMargin())
     else println("get out of here")

}

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

const val WELCOME_MESSAGE = """Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас 
    |на борту корабля "Heart of Gold". [вздыхает...] Что ж, введи, пожалуйста, 
    |свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда 
    |готов служить, хотя это не приносит мне радости... но вы, наверное, об этом 
    |не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."""
const val AUTH_MESSAGE = """[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "$USER_NAME", вам 
    |разрешено входить на борт корабля "Heart of Gold". 
    |Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце 
    |концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь 
    |больше, чем мне."""