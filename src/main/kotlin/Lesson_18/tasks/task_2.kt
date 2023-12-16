package Lesson_18.tasks

import kotlin.random.Random

fun main() {

    val fourFaces = FourFaces(4)
    val sixFaces = SixFaces(6)
    val aitFaces = AitFaces(8)

    val listOfDice = arrayOf<NumberOfFaces>(fourFaces, sixFaces, aitFaces)
    listOfDice.forEach { println(it.rollDice()) }

}

open class NumberOfFaces {
    open fun rollDice() = 0
}

class FourFaces(
    private val fourFacesCount: Int,
): NumberOfFaces() {
    override fun rollDice(): Int {
        val randomFace = 1..fourFacesCount
        return randomFace.random()
    }
}

class SixFaces(
    private val sixFacesCount: Int,
): NumberOfFaces() {
    override fun rollDice(): Int {
        val randomFace = 1..sixFacesCount
        return randomFace.random()
    }
}

class AitFaces(
    private val aitFacesCount: Int,
): NumberOfFaces() {
    override fun rollDice(): Int {
        val randomFace = 1..aitFacesCount
        return randomFace.random()
    }
}