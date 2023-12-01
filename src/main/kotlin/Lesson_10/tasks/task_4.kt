package Lesson_10.tasks


fun main() {

    var humanWinsCount = 0
    var continueGame = true

    while (continueGame) {
        val rollByHuman = rollDice()
        val rollByComputer = rollDice()

        newRound(rollByHuman, rollByComputer)

        var result = checkGameResults(rollByHuman, rollByComputer)

        if (result == 1) humanWinsCount++

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

fun newRound(rollByComputer: Int, rollByHuman: Int) {
    println("$COMPUTER_ROLL $rollByComputer\n$HUMAN_ROLL $rollByHuman")
}

fun checkGameResults(rollByComputer: Int, rollByHuman: Int): Int {
    return if (rollByHuman > rollByComputer) {
        println("Победил человек с результатом $rollByHuman")
        1
    } else {
        println("Победил компютер с результатом $rollByComputer")
        0
    }
}

const val COMPUTER_ROLL = "Компьютер бросил кости, результат: "
const val HUMAN_ROLL = "Вы бросили кости, результат: "
const val PLAY_AGAIN = "Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\""