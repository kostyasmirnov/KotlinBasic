package Lesson_18.tasks

fun main() {

    val screen = Screen()
    val point = Point(4, 5)
    val square = Square(point, 12)
    val circle = Circle(point, 9)

    screen.draw(point)
    screen.draw(square)
    screen.draw(circle)

}

abstract class Figure {
    abstract fun draw()
}

class Square(
    private val top: Point,
    private val lenghtSide: Number,
) : Figure() {

    override fun draw() {
        println("Нарисован квадрт с координатой ${top.x}, ${top.y} и длиной $lenghtSide")
    }

}

class Circle(
    private val center: Point,
    private val radius: Number,
) : Figure() {

    override fun draw() {
        println("Нарисована окружность с центром ${center.x}, ${center.y} и радиусом $radius")
    }
}

class Point(
    val x: Number,
    val y: Number,
) : Figure() {
    override fun draw() {
        println("Нарисована точка по координатам $x, $y")
    }
}

class Screen {
    fun draw(figure: Figure) {
        figure.draw()
    }
}