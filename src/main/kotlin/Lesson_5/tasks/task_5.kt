package Lesson_5.tasks

import kotlin.random.Random

fun main() {

    val winningNumbers = List(3) { Random.nextInt(0, 43) }

    println(WELCOME_MESSAGE)
    println(ENTER_FIRST_NUMBER)
    val userNumber1 = readln().toInt()
    println(ENTER_SECOND_NUMBER)
    val userNumber2 = readln().toInt()
    println(ENTER_THIRD_NUMBER)
    val userNumber3 = readln().toInt()
    val userNumbers = mutableListOf<Int>(userNumber1, userNumber2, userNumber3)

    val matches = winningNumbers.intersect(userNumbers).size
    when (matches) {
        3 -> println(THREE_CONDITIONS_TRUE)
        2 -> println(TWO_CONDITIONS_TRUE)
        1 -> println(ONE_CONDITIONS_TRUE)
        else -> println(NO_ONE_CONDITIONS_TRUE)
    }
    println("$END_GAME_MESSAGE $winningNumbers")
}

const val WELCOME_MESSAGE = "Угадайте три числа от 0 до 42"
const val ENTER_FIRST_NUMBER = "Введите первое число: "
const val ENTER_SECOND_NUMBER = "Введите второе число: "
const val ENTER_THIRD_NUMBER = "Введите третье число: "
const val THREE_CONDITIONS_TRUE = "Вы угадали все три числа и выиграли джекпот!"
const val TWO_CONDITIONS_TRUE = "Вы угадали 2 числа и получаете крупный приз!"
const val ONE_CONDITIONS_TRUE = "Вам пологается утешительный приз!"
const val NO_ONE_CONDITIONS_TRUE = "Вы не угадали ни одного числа."
const val END_GAME_MESSAGE = "Загаданые числа были: "



