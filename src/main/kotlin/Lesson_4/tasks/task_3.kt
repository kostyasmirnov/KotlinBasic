package Lesson_4.tasks


fun main() {

    val isSunnyWeather: Boolean = true
    val isOpenTent: Boolean = true
    val airHumidity: Int = 20
    val isWinterNow: Boolean = true

    var analysisOfConditions = (IS_SUNNY_WEATHER == isSunnyWeather and IS_OPEN_TENT == isOpenTent and IS_WINTER_NOW == isWinterNow)  and (AIR_HUMIDITY == airHumidity)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")

}

const val IS_SUNNY_WEATHER: Boolean = true
const val IS_OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val IS_WINTER_NOW: Boolean = false