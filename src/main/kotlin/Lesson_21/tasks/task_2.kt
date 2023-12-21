package Lesson_21.tasks

fun main() {

    val listNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {

    var sum: Int = 0

    for (i in this) {
        if (i % 2 == 0) sum += i
    }

    return sum
}