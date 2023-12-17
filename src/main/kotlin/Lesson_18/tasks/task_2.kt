package Lesson_18.tasks

import kotlin.random.Random

fun main() {

    val fourFaces = FourFaces()
    val sixFaces = SixFaces()
    val aitFaces = AitFaces()

    val listOfDice = arrayOf<NumberOfFaces>(fourFaces, sixFaces, aitFaces)
    listOfDice.forEach { println(it.rollDice()) }

}

abstract class NumberOfFaces(
    val facesCount :Int,
) {
    open fun rollDice(): Int {
        val randomFace = 1..facesCount
        return randomFace.random()
    }
}

class FourFaces: NumberOfFaces(4) {
    override fun rollDice(): Int {
        val randomFace = 1..facesCount
        return randomFace.random()
    }
}

class SixFaces: NumberOfFaces(6) {
    override fun rollDice(): Int {
        val randomFace = 1..facesCount
        return randomFace.random()
    }
}

class AitFaces: NumberOfFaces(8) {
    override fun rollDice(): Int {
        val randomFace = 1..facesCount
        return randomFace.random()
    }
}