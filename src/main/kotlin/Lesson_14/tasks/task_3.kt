package Lesson_14.tasks

import kotlin.math.PI

fun main() {

    var sumWhiteFigures: Int
    var sumBlackFigures: Int

    val rectangle1: Int = Rectangle(10, 12, BLACK_COLOR).calculateArea()
    val rectangle2: Int = Rectangle(20, 10, WHITE_COLOR).calculateArea()
    val rectangle3: Int = Rectangle(30, 30, BLACK_COLOR).calculateArea()
    val circle1: Int = Circle(10, WHITE_COLOR).calculatePerimeter()
    val circle2: Int = Circle(20, BLACK_COLOR).calculatePerimeter()
    val circle3: Int = Circle(30, WHITE_COLOR).calculatePerimeter()

    sumWhiteFigures = rectangle2 + circle1 + circle3
    sumBlackFigures = rectangle1 + rectangle3 + circle2
    println("-Сумма периметров всех черных фигур = $sumBlackFigures\n-Сумма площадей всех белых фигур = $sumWhiteFigures")

}

abstract class Figure(
    val color: String,
) {

    abstract fun calculateArea(): Int

    abstract fun calculatePerimeter(): Int

}

class Circle(
    val radius: Int,
    color: String,
) : Figure(
    color = color
) {
    override fun calculateArea(): Int {
        return (PI * (radius * radius)).toInt()
    }

    override fun calculatePerimeter(): Int {
        return (2 * PI * radius).toInt()
    }
}

class Rectangle(
    val width: Int,
    val height: Int,
    color: String,
) : Figure(
    color = color
) {
    override fun calculateArea(): Int {
        return (width * height)
    }

    override fun calculatePerimeter(): Int {
        return 2 * (width + height)
    }
}

const val WHITE_COLOR = "white"
const val BLACK_COLOR = "black"
