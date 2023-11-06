package Lesson_1.tasks

fun main() {

    val yearOfFirstSpaceFlight: Int = 1964
    var hourOfStartSpaceFlight: Int = 9
    var minutesOfStartSpaceFlight: Int = 7
    println("Год первого полета в космос:" + yearOfFirstSpaceFlight)
    println("Полет был совершено в ${hourOfStartSpaceFlight} часов")
    println("${minutesOfStartSpaceFlight} минут")

    hourOfStartSpaceFlight = 10
    minutesOfStartSpaceFlight = 55
    println("Время посадки: " + hourOfStartSpaceFlight + ":" + minutesOfStartSpaceFlight)
}