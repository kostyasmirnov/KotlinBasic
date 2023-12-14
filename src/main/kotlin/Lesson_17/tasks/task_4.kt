package Lesson_17.tasks

fun main() {

    val package1 = Package(1, "Амстердам")
    println("Местоположение посылки: ${package1.displayCurrentLocation}")
    package1.displayCurrentLocation = "Франкфурт"
    println("Местоположение посылки: ${package1.displayCurrentLocation}, счечтик перемещений = ${package1.countOfMovements}")

}

class Package(
    private val number: Int,
    private var currentLocation: String,
) {

    var countOfMovements: Int = 0
        private set

    var displayCurrentLocation: String = currentLocation
        set(value) {
            field = value
            countOfMovements++
        }
}