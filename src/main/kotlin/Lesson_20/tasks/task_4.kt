package Lesson_20.tasks

fun main() {

    val elements = listOf("A", "B", "C", "D", "E")

    val lambdaList = elements.mapIndexed { index, element ->
        if (index % 2 == 1) {
            println("Нажат элемент $element")
        } else {
            { }
        }
    }

}
