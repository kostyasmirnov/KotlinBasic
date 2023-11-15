package Lesson_5.tasks

fun main() {

    println("Для входа в приложение необходимо доказать что вы человек \n" +
            "Сколько будет 12+12?")

    val userAnswer = readln()!!.toInt()
    val expression = 12
    val answer = expression + expression

    if (userAnswer == answer) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен")

}

