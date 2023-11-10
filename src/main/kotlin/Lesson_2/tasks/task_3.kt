package Lesson_2.tasks

fun main() {

    val timeDepartureInHours: Int = 9
    val timeDepartureInMinutes: Int = 39

    val timeOnTheWay: Int = 457

    val travelHours = timeOnTheWay / 60 //7.616
    val travelMinutes = timeOnTheWay % 60 // 0.65

    val arrivalHour = (timeDepartureInHours + travelHours + (timeDepartureInMinutes + travelMinutes) / 60) % 24
    val arrivalMinute = (timeDepartureInMinutes + travelMinutes) % 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")

}