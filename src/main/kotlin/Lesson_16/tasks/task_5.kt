package Lesson_16.tasks

import kotlin.random.Random

fun main() {

    val player1 = Player("Игрок1", 100, 10)

    player1.takeDamage(30)
    println("Здоровье игрока ${player1.name}: ${player1.health}")

    player1.takeDamage(50)
    println("Здоровье игрока ${player1.name}: ${player1.health}")

    player1.heal(20)
    println("Здоровье игрока ${player1.name} после лечения: ${player1.health}")

    player1.takeDamage(100)

}

class Player(var name: String, var health: Int, var damage: Int) {
    var isAlive = true

    fun takeDamage(damage: Int) {
        if (isAlive) {
            health -= damage
            if (health <= 0) {
                health = 0
                isAlive = false
                death()
            }
        }
    }

    fun heal(healAmount: Int) {
        if (isAlive) {
            health += healAmount
        }
    }

    fun death() {
        health = 0
        damage = 0
        println("$name умер!")
    }
}
