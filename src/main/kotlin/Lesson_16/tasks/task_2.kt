package Lesson_16.tasks


fun main() {

    val circle1: Circle = Circle(10.0)

    circle1.calculateArea()
    circle1.calculateLength()
}

class Circle(
    val radius: Double,
) {

    fun calculateLength() {
        println(2 * PI * radius)
    }

    fun calculateArea() {
        println(PI * (radius * radius))
    }
}

private const val PI: Double = 3.14