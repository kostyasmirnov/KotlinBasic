package Lesson_17.tasks

fun main() {

    val ship1 = Ship()
    println(ship1.name)
    ship1.name = "Катер"

}

class Ship {

    var name: String = "Крейсер"
        get() = field
        set(value: String) {
            println("Нельзя изменить имя коробля")
        }
    var averageSpeed: Int = 200
    var portAddress: String = "г. Мурманск"

}