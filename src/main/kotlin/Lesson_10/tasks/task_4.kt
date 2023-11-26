package Lesson_10.tasks


fun main() {

    var humanWinsCount = 0
    var continueGame = true

    while (continueGame) {
        println(COMPUTER_ROLL)
        val rollByComputer = rollDice()
        println(HUMAN_ROLL)
        val rollByHuman = rollDice()

        val result = checkGameResults(rollByHuman, rollByComputer)

        if (result == 1) humanWinsCount++
        continueGame = continueGame()
    }

}

fun continueGame(): Boolean {
    println(PLAY_AGAIN)
    val humanChoice = readln().lowercase().trim()
    return humanChoice == "да"
}

fun rollDice(): Int {
    return (1..6).random()
}

fun checkGameResults(rollByComputer: Int, rollByHuman: Int): Int {
    if (rollByHuman > rollByComputer) {
        println("Победил человек с результатом $rollByHuman")
        return 1
    } else {
        println("Победил компютер с результатом $rollByComputer")
        return 0
    }
}

const val COMPUTER_ROLL = "Компьютер бросил кости, результат: "
const val HUMAN_ROLL = "Вы бросили кости, результат: "
const val PLAY_AGAIN = "Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\""