package Lesson_4.tasks


fun main() {

    var analysisOfConditions = (isSunnyWeather == true and isOpenTent == true and isWinterNow == false)  and (airHumidity == 20)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")

}

const val isSunnyWeather: Boolean = true
const val isOpenTent: Boolean = true
const val airHumidity: Int = 20
const val isWinterNow: Boolean = true