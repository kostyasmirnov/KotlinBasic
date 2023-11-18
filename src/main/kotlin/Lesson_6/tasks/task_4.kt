package Lesson_6.tasks

fun main() {

    val randomNumber = (1..9).random()

    do {
        val inputNumberFromUser = readln().toInt()
        if (randomNumber == inputNumberFromUser) println(WINNER_MESSAGE)
        else println(INCORRECT_ANSWER_MESSAGE)
        COUNTER--
    } while (COUNTER > 0)

    println(LOSER_MESSAGE + randomNumber)

}

const val WINNER_MESSAGE: String = "Это была великолепная игра!"
const val INCORRECT_ANSWER_MESSAGE: String = "Неверно"
const val LOSER_MESSAGE: String = "Было загадано число "
var COUNTER: Int = 5