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
    val maxTables = 13

    var reservationResult = reservationToday < maxTables
    println("Доступность столиков на сегодня: $reservationResult")

    reservationResult = reservationTomorrow < maxTables
    println("Доступность столиков на завтра: $reservationResult")



}