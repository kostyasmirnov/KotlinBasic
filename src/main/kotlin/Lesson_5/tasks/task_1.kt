package Lesson_5.tasks

fun main() {

    println("Для входа в приложение необходимо доказать что вы человек \n" +
            "Сколько будет 12+12?")

    val userAnswer = readln().toInt()
    val number1 = 12
    val number2 = 12
    val answer = number1 + number2

    if (userAnswer == answer) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен")

}

