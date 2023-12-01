package Lesson_12.tasks

fun main() {

    val weather1 = Weather2()
    val weather2 = Weather2(10, 3, true)

    weather1.printWeather()
    println()
    weather2.printWeather()

}

class Weather2(
    var temperatureDayTime: Int = 20,
    var temperatureNight: Int = 10,
    var wasPrecipitation: Boolean = false,
) {


    fun printWeather() {
        println(temperatureDayTime)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}