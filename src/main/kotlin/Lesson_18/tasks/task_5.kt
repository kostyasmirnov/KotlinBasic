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
    abstract fun draw(screen: Screen)
}

class Square(val topLeft: Point, val sideLength: Number) : Figure() {
    override fun draw(screen: Screen) {
        screen.draw(this)
    }
}

class Circle(val center: Point, val radius: Number) : Figure() {
    override fun draw(screen: Screen) {
        screen.draw(this)
    }
}

data class Point(
    val x: Number,
    val y: Number,
) : Figure() {
    override fun draw(screen: Screen) {
        screen.draw(this)
    }
}

class Screen {
    fun draw(point: Point) {
        println("Нарисована точка с координатами: (${point.x}, ${point.y})")
    }

    fun draw(square: Square) {
        println("Нарисована квадрат с координатами (${square.topLeft.x}, ${square.topLeft.y}) и длинной стороны ${square.sideLength}")
    }

    fun draw(circle: Circle) {
        println("Нарисована окружность с координатами (${circle.center.x}, ${circle.center.y}) и радиусом ${circle.radius}")
    }
}