package Lesson_12.tasks

fun main() {

    val weather1 = Weather4(30, 20)
    println()
    val weather2 = Weather4(10, 3, true)

}

class Weather4(
    var temperatureDayTime: Int,
    var temperatureNight: Int,
    var wasPrecipitation: Boolean = false,
) {

    init {
        printWeather4()
    }

    fun printWeather4() {
        println(temperatureDayTime)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}