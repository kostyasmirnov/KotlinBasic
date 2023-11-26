package Lesson_10.tasks

import java.util.UUID

fun main() {

    var isAuthCompleted = false
    println(WELCOME_MESSAGE_FOR_10_1)

    while (!isAuthCompleted) {
        val userName = readln().toString()!!
        val password = readln().toString()!!

        val token = authorization(userName, password)

        if (token != null) {
            println(getBasket(token))
            isAuthCompleted = true
        } else {
            println(INCORRECT_AUTH)
        }
    }

}

fun authorization(userName: String, password: String): String? {
    var token = ""
    if (userName == LOGIN && password == PASSWORD) {
        token = UUID.randomUUID().toString().replace("-", "").substring(0, 32)
        println(token)
        return token
    } else return null
}

fun getBasket(token: String): String? {
    return if (token.isNotEmpty()) BASKET
    else null
}

const val LOGIN = "log"
const val PASSWORD = "pass"
const val BASKET = """
    macbook pro 23 m404 - 8999$
    iphone XR100500 - 9999$
    доширак - 59 руб
"""
const val INCORRECT_AUTH = "Неверный логин или пароль \nПопробуйте еще раз: "
const val WELCOME_MESSAGE_FOR_10_1 = "Введите сначала логин, потом пароль"