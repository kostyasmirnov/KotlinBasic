package Lesson_16.tasks


fun main() {

    val player1 = Player("Игрок #1", 100, 10)

    player1.takeDamage(30)
    println("Здоровье игрока ${player1.name}: ${player1.health}")

    player1.takeDamage(50)
    println("Здоровье игрока ${player1.name}: ${player1.health}")

    println("Здоровье игрока ${player1.name} после лечения: ${player1.health}")

    player1.takeDamage(100)

}

class Player(
    var name: String,
    var health: Int,
    private var damage: Int,
) {

    var isDead: Boolean = false

    fun takeDamage(damage: Int) {
        if (!isDead) {
            health -= damage
        }
        if (health <= 0) {
            isDead = true
            death()
        }
    }


    fun heal(healAmount: Int) {
        if (!isDead) {
            health += healAmount
        }
    }

    private fun death() {
        health == 0
        damage == 0
        println("$name Умер!")
    }

}