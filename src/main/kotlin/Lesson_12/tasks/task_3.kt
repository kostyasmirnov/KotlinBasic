package Lesson_12.tasks

fun main() {

    val weather1 = Weather3()
    weather1.printWeather3()

}

class Weather3 {

    val kelvinDayTemperature: Int = 303
    val kelvinTemperatureNight: Int = 293
    val wasPrecipitation: Boolean = true

    val degreeDayTemperature: Int = kelvinDayTemperature - degreeCelsius
    val degreeTemperatureNight: Int = kelvinTemperatureNight - degreeCelsius

    fun printWeather3() {
        println(degreeDayTemperature)
        println(degreeTemperatureNight)
        println(wasPrecipitation)
    }
}

const val degreeCelsius: Int = 273.15.toInt()