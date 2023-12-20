package Lesson_20.tasks

fun main() {

    val player1 = Player("Костя", false)

    val openDoor: (player: Player) -> Unit = {
        if (player1.isHaveKey) println("${player1.name} открыл дверь")
        else println("Дверь заперта")
    }

    openDoor(player1)
    player1.isHaveKey = true
    openDoor(player1)

}

class Player(
    val name: String,
    var isHaveKey: Boolean,
)