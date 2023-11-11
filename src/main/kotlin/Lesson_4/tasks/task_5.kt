package Lesson_4.tasks

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {

    val shipWithoutDamage: Boolean
    val crew: Int
    val numberOfBoxesOfProvisions: Int
    val favorableWeather: Boolean

    val rangeCrew = 55..70
    val minBoxes = 50

    shipWithoutDamage = readlnOrNull()?.toBoolean() ?: false
    crew = readlnOrNull()?.toInt() ?: 0
    numberOfBoxesOfProvisions = readlnOrNull()?.toInt() ?: 0
    favorableWeather = readlnOrNull()?.toBoolean() ?: false

    fun checkConditions(
        shipWithoutDamage: Boolean,
        crew: Int,
        numberOfBoxesOfProvisions: Int,
        favorableWeather: Boolean): Boolean {
        return ((shipWithoutDamage and favorableWeather == true)
                and (crew in rangeCrew )
                and (numberOfBoxesOfProvisions >= minBoxes))

        }

    fun checkConditions2(
        shipWithoutDamage: Boolean,
        crew: Int,
        numberOfBoxesOfProvisions: Int,
        favorableWeather: Boolean): Boolean {
        return ((shipWithoutDamage == false and favorableWeather == true)
                and (crew >= 70)
                and (numberOfBoxesOfProvisions >= minBoxes))
    }

    if (checkConditions(shipWithoutDamage, crew, numberOfBoxesOfProvisions, favorableWeather) || checkConditions2(shipWithoutDamage, crew, numberOfBoxesOfProvisions, favorableWeather)) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}