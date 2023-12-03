package Lesson_12.tasks

fun main() {

    val weather1 = Weather()
    val weather2 = Weather()

    weather1.temperatureDayTime = 30
    weather1.temperatureNight = 18
    weather1.wasPrecipitation = true

    weather2.temperatureDayTime = 10
    weather2.temperatureNight = 3
    weather2.wasPrecipitation = true

    weather1.printWeather()
    println()
    weather2.printWeather()

}

class Weather {
    var temperatureDayTime = 20
    var temperatureNight = 10
    var wasPrecipitation = false

    fun printWeather() {
        println(temperatureDayTime)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}