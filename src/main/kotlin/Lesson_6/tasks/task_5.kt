package Lesson_6.tasks


fun main() {

    println(STARTER_MESSAGE)
    var counter: Int = 3

    do {
        var number1 = (1..9).random()
        var number2 = (1..9).random()
        println("$number1 + $number2")
        val userAnswer = readln().toInt()
        if (userAnswer == number1 + number2) return println(ACCESS_TRUE)
        else if (counter > 1) println(TRY_AGAIN)
        counter--
    } while (counter > 0)

    println(ACCESS_DENIED)

}

const val STARTER_MESSAGE = "Решите простой математический пример: "
const val ACCESS_TRUE = "Добро пожаловать!"
const val TRY_AGAIN = "Попробуйте еще раз!"
const val ACCESS_DENIED = "Доступ запрещен."


