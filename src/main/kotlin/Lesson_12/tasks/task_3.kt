package Lesson_12.tasks

fun main() {

    val weather1 = Weather3(30, 20)
    val weather2 = Weather3(10, 3, true)

    weather1.printWeather3()
    println()
    weather2.printWeather3()

}

class Weather3(
    private var temperatureDayTime: Int,
    private var temperatureNight: Int,
    private var wasPrecipitation: Boolean = false,
) {

    init {
        this.temperatureDayTime = 15
        this.temperatureNight = 8
        this.wasPrecipitation = false
    }

    fun printWeather3() {
        println(temperatureDayTime)
        println(temperatureNight)
        println(wasPrecipitation)
    }
}