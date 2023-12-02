package Lesson_10.tasks


fun main() {

    var humanWinsCount = 0
    var continueGame = true

    while (continueGame) {
        val rollByComputer = rollDice()
        val rollByHuman = rollDice()


        newRound(rollByComputer, rollByHuman)

        var result = isHumanWin(rollByComputer = rollByComputer, rollByHuman = rollByHuman)

        if (result) humanWinsCount++

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

fun isHumanWin(rollByComputer: Int, rollByHuman: Int): Boolean {
    return if (rollByComputer < rollByHuman) {
        println("Победил человек с результатом $rollByHuman")
        true
    } else {
        println("Победил компютер с результатом $rollByComputer")
        false
    }
}

const val COMPUTER_ROLL = "Компьютер бросил кости, результат: "
const val HUMAN_ROLL = "Вы бросили кости, результат: "
const val PLAY_AGAIN = "Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\""