package Lesson_18.tasks

import kotlin.math.pow

fun main() {

    val cubPackage = Cub(8.0)
    val rectanglePackage = Rectangle(10.0, 4.0, 5.0)

    println(cubPackage.area())
    println(rectanglePackage.area())

}


abstract class Package {

    abstract fun area(): String
}

class Rectangle(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Package() {
    override fun area(): String = "Площадь коробки: ${2 * (length * width + length * height + width * height)}"
}

class Cub(
    private val side: Double,
) : Package() {
    override fun area(): String = "Площадь куба: ${6 * side.pow(2.0)}"
}
