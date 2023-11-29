package Lesson_10.tasks


fun main() {

    var humanWinsCount = 0
    var continueGame = true

    while (continueGame) {
        val rollByComputer = rollDice()
        println(COMPUTER_ROLL + rollByComputer)
        val rollByHuman = rollDice()
        println(HUMAN_ROLL + rollByHuman)

        var result = checkGameResults(rollByHuman, rollByComputer)

        if (result > 0) humanWinsCount++

        continueGame = continueGame()
    }

    println("Вы выиграли $humanWinsCount партий")

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
    if (rollByComputer > rollByHuman) {
        println("Победил человек с результатом $rollByComputer")
        return 1
    } else {
        println("Победил компютер с результатом $rollByHuman")
        return 0
    }
}

const val COMPUTER_ROLL = "Компьютер бросил кости, результат: "
const val HUMAN_ROLL = "Вы бросили кости, результат: "
const val PLAY_AGAIN = "Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\""