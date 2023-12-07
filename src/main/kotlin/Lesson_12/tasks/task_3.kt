package Lesson_12.tasks

fun main() {

    val weather1 = Weather3(303, 293, true)
    weather1.printWeather3()

}

class Weather3(
    kelvinDayTemperature: Int,
    kelvinTemperatureNight: Int,
    wasPrecipitation: Boolean,
) {

    val dayTemperature: Int = (kelvinDayTemperature - DEGREE_CELSIUS).toInt()
    val nightTemperature: Int = (kelvinTemperatureNight - DEGREE_CELSIUS).toInt()
    val wasPrecipitation: Boolean = wasPrecipitation

    fun printWeather3() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasPrecipitation)
    }
}

const val DEGREE_CELSIUS: Double = 273.15