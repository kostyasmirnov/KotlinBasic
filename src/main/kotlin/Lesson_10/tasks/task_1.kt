package Lesson_10.tasks


fun main() {

    println(COMPUTER_ROLL)
    val rollByComputer = rollDice()
    println(HUMAN_ROLL)
    val rollByHuman = rollDice()
    if (rollByComputer > rollByHuman) println("Победил компютер с результатом $rollByComputer")
    else println("Победил человек с результатом $rollByHuman")

}

fun rollDice(): Int {
    val rangeNumbers = (1..6)
    return rangeNumbers.random()
}

const val COMPUTER_ROLL = "Компьютер бросил кости, результат: "
const val HUMAN_ROLL = "Вы бросили кости, результат: "