package Lesson_21.tasks

fun main() {

    val player1 = Player("Obs", 50)
    val player2 = Player("Sentry", 100)

    listOf(player1, player2).forEach { println(it.isHealty()) }

}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
)

fun Player.isHealty(): Boolean {

    return maxHealth == currentHealth

}