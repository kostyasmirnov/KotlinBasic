package Lesson_12.tasks

fun main() {

    val weather1 = Weather3(303, 293, true)
    weather1.printWeather3()

}

class Weather3(
    val kelvinDayTemperature: Int,
    val kelvinTemperatureNight: Int,
    val wasPrecipitation: Boolean,
) {

    val dayTemperature: Int = (kelvinDayTemperature - degreeCelsius).toInt()
    val nightTemperature: Int = (kelvinTemperatureNight - degreeCelsius).toInt()

    fun printWeather3() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasPrecipitation)
    }
}

const val degreeCelsius: Double = 273.15