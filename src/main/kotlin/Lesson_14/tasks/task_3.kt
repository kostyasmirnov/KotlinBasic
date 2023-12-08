package Lesson_14.tasks

import kotlin.math.PI

fun main() {

    var sumWhiteFigures: Int
    var sumBlackFigures: Int

    val figures = listOf(
        Rectangle(10, 12, BLACK_COLOR),
        Rectangle(20, 10, WHITE_COLOR),
        Rectangle(30, 30, BLACK_COLOR),
        Circle(10, WHITE_COLOR),
        Circle(20, BLACK_COLOR),
        Circle(30, WHITE_COLOR),
    )

    sumWhiteFigures = figures.filter { it.color == WHITE_COLOR }.sumBy { it.calculateArea() }
    sumBlackFigures = figures.filter { it.color == BLACK_COLOR }.sumBy { it.calculatePerimeter() }

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
