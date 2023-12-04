package Lesson_14

open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {

    fun switchToWarpMode() {
        println("Переход в варп-режим")
    }

    open fun runSystemDiagnostic() {
        println("Запущена диагностика системы коробля")
    }
}