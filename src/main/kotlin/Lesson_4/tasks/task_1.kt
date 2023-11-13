package Lesson_4.tasks

fun main() {

    /**
     * всего 13 столов
     * брони на сегодня все столы
     * а на завтра осталось 4 свободных
     *
     */

    val reservationToday = 13
    val reservationTomorrow = reservationToday - 4

    val isAvailableToday = reservationToday < maxTables
    println("Доступность столиков на сегодня: $isAvailableToday")

    val isAvailableTomorrow = reservationTomorrow < maxTables
    println("Доступность столиков на завтра: $isAvailableTomorrow")



}

const val MAX_TABLES = 13