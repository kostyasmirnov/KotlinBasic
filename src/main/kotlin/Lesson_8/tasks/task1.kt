package Lesson_8.tasks

fun main() {

    val viewsOnWeek: IntArray = intArrayOf(MONDAY_VIEWS, TUESDAY_VIEWS, WEDNESDAY_VIEWS, THURSDAY_VIEWS, FRIDAY_VIEWS, SATURDAY_VIEWS, SUNDAY_VIEWS)
    var sum = 0
    viewsOnWeek.forEach { sum += it }
    println("Просмотров за неделю было: $sum")

}

const val MONDAY_VIEWS = 150
const val TUESDAY_VIEWS = 200
const val WEDNESDAY_VIEWS = 230
const val THURSDAY_VIEWS = 270
const val FRIDAY_VIEWS = 360
const val SATURDAY_VIEWS = 480
const val SUNDAY_VIEWS = 590