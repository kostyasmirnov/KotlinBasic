package Lesson_5.tasks

fun main() {

    println("Для входа в приложение необходимо доказать что вы человек \n" +
            "Сколько будет 12+12?")

    var userAnswer = readLine()!!.toInt()

    if (userAnswer == ANSWER) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен")

}

const val ANSWER: Int = 24