package Lesson_19.tasks

fun main() {

    val starkiller = SpaceShip()
    starkiller.perfromAction(Action.LANDING)
}

enum class Action {
    TAKE_OFF,
    LANDING,
    DEFEND,
}

class SpaceShip {

    fun perfromAction(action: Action) {
        when (action) {
            Action.TAKE_OFF -> takeoff()
            Action.LANDING -> landing()
            Action.DEFEND -> defend()
        }
    }

    private fun takeoff() {
        // TODO(здесь нужна информация о дополнительной логике!!)
    }

    private fun landing() {
        println("Садимся")
    }

    private fun defend() {
        throw (NotImplementedError("Надо доработать"))
    }
}

