package Lesson_14

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterBurnerSpeed: Int,
) : Spaceship(name, speed) {

    fun handleDataFromRadar() {
        println("$name: обработка данных с радара")
    }

    fun runAfterBurner() {
        println("$name: формаc запущен")
    }

}