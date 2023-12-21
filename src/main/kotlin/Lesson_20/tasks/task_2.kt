package Lesson_20.tasks

fun main() {

    val player1 = Player("Viking", 50)

    val healingPotion: (player: Player) -> Unit = { player1.currentHealth = player1.maxHealth }
    healingPotion(player1)
    println("Теперь здоровье ${player1.name} = ${player1.currentHealth}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
)