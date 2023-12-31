package Lesson_12.tasks

fun main() {

    val weather1 = Weather2(30, 10, false)
    val weather2 = Weather2(10, 3, true)

    weather1.printWeather()
    println()
    weather2.printWeather()

}

class Weather2(
    val temperatureDayTime: Int,
    val temperatureNight: Int,
    val wasPrecipitation: Boolean,
) {


    fun printWeather() {
        println(temperatureDayTime)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}