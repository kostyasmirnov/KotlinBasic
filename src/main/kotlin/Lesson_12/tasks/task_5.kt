package Lesson_12.tasks

import kotlin.random.Random

fun main() {

    val listOfDayWeather: MutableList<Weather5> = mutableListOf()
    val middleTemperatureDayTime: MutableList<Int> = mutableListOf()
    val middleTemperatureNight: MutableList<Int> = mutableListOf()
    val wasPrecipitationCount: MutableList<Int> = mutableListOf()

    for (i in (1..COUNT_DAYS)) {
        listOfDayWeather += Weather5((0..40).random(), (-10..15).random(),
        Random.nextBoolean())
    }

    listOfDayWeather.forEach {
        middleTemperatureDayTime.add(it.temperatureDayTime)
        middleTemperatureNight.add(it.temperatureNight)
        if (it.wasPrecipitation) {
            wasPrecipitationCount += 1
        }
    }

    println("Дневная средння темперутра за $COUNT_DAYS дней: ${middleTemperatureDayTime.average()}")
    println("Ночная средння темперутра за $COUNT_DAYS дней: ${middleTemperatureNight.average()}")
    println("Из $COUNT_DAYS дней, с осадками было: ${middleTemperatureDayTime.average()}")
}

class Weather5(
    var temperatureDayTime: Int = 15,
    var temperatureNight: Int= 8,
    var wasPrecipitation: Boolean = false,
)

const val COUNT_DAYS = 30