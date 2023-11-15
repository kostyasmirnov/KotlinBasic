package Lesson_4.tasks

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    var hasNoDamages: Boolean = readlnOrNull()?.toBoolean() ?: false
    var crew: Int = readlnOrNull()?.toInt() ?: 0
    var isNumberOfBoxesOfProvisions: Int = readlnOrNull()?.toInt() ?: 0
    var isFavorableWeather: Boolean = readlnOrNull()?.toBoolean() ?: false

    if (checkConditions(hasNoDamages, crew, isNumberOfBoxesOfProvisions, isFavorableWeather) || checkConditions2(hasNoDamages, crew, isNumberOfBoxesOfProvisions, isFavorableWeather)) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}

const val MIN_RANGE_CREW = 55
const val MAX_RANGE_CREW = 70
const val MIN_BOXES = 50

fun checkConditions(
    isShipWithDamage: Boolean,
    crew: Int,
    isNumberOfBoxesOfProvisions: Int,
    isFavorableWeather: Boolean): Boolean {
    return ((isShipWithDamage == true)
            and (crew in MIN_RANGE_CREW..MAX_RANGE_CREW )
            and (isNumberOfBoxesOfProvisions > MIN_BOXES))

}

fun checkConditions2(
    isShipWithDamage: Boolean,
    crew: Int,
    isNumberOfBoxesOfProvisions: Int,
    isFavorableWeather: Boolean): Boolean {
    return ((isFavorableWeather == true)
            and (crew == MAX_RANGE_CREW)
            and (isNumberOfBoxesOfProvisions > MIN_BOXES))
}