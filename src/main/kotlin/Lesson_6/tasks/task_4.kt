package Lesson_6.tasks

fun main() {

    val randomNumber = (1..9).random()
    var counter = COUNTER
    do {
        val inputNumberFromUser = readln().toInt()
        if (randomNumber == inputNumberFromUser) println(WINNER_MESSAGE)
        else println(INCORRECT_ANSWER_MESSAGE)
        counter--
    } while (counter > 0)

    println("$LOSER_MESSAGE $randomNumber")

}

const val WINNER_MESSAGE: String = "Это была великолепная игра!"
const val INCORRECT_ANSWER_MESSAGE: String = "Неверно"
const val LOSER_MESSAGE: String = "Было загадано число "
const val COUNTER: Int = 5