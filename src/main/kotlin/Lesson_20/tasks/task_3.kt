package Lesson_20.tasks

fun main() {

    val player1 = Player("Костя", false)

    val openDoor: () -> Unit = {
        if (player1.isHaveKey) println("${player1.name} открыл дверь")
        else println("Дверь заперта")
    }

    openDoor.invoke()
    player1.isHaveKey = true
    openDoor.invoke()

}

class Player(
    val name: String,
    var isHaveKey: Boolean,
)