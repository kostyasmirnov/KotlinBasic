package Lesson_1.tasks

fun main() {

    var seconds: Int = 6480
    val minutes: Int = (seconds % 3600) / 60
    val hours: Int = seconds / 3600
    seconds = seconds % 60


    println("Время проведенное в космосе: " + hours + ":" + minutes + ":" + seconds)

}