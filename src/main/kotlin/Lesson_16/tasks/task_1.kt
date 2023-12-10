package Lesson_16.tasks

import kotlin.random.Random

fun main() {

    Cube().getRandomNuber()
}

class Cube {

    private val randomNumber: Int = Random.nextInt(1, 7)

    fun getRandomNuber() {
        println("На кубике выпало число: $randomNumber")
    }
}