package Lesson_2.tasks

import kotlin.math.pow

fun main() {
    val initialDeposit = 70000
    val annualInterestRate: Double = 16.7 / 100
    val years = 20

    val finalAmount = initialDeposit * (1 + annualInterestRate).pow(years)

    println("Финальная сумма после $years лет будет: %.3f".format(finalAmount))
}