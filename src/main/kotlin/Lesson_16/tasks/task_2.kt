package Lesson_16.tasks

import kotlin.math.pow


fun main() {

    val circle1: Circle = Circle(10.0)

    circle1.calculateArea()
    circle1.calculateLength()
}

class Circle(
    private val radius: Double,
) {

    fun calculateLength() {
        println(2 * PI * radius)
    }

    fun calculateArea() {
        println(PI * (radius.pow(2.0)))
    }
}

private const val PI: Double = 3.14