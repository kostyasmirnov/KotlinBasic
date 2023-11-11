package Lesson_4.tasks

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {

    val isSunnyWeather: Boolean
    val isOpenTent: Boolean
    val airHumidity: Int
    val isWinterNow: Boolean

    isSunnyWeather = true
    isOpenTent = true
    airHumidity = 20
    isWinterNow = true

    var result = (isSunnyWeather == true and isOpenTent == true and isWinterNow == false)  and (airHumidity == 20)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}