package Lesson_12.tasks

fun main() {

    val weather1 = Weather3()
    weather1.printWeather3()

}

class Weather3 {

    val temperatureDayTime: Int = 30
    val temperatureNight: Int = 20
    val wasPrecipitation: Boolean = true

    fun printWeather3() {
        println(temperatureDayTime + 273.15)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}