package Lesson_14.tasks

fun main() {

    val linerShip1 = LinerShip()
    val iceBreakerShip1 = IceBreakerShip()
    val cargoShip1 = CargoShip()

}

open class LinerShip(
    val speed: Int = 200,
    val name: String = "Лайнер",
    val numerOfPassengers: Int = 200,
)

class IceBreakerShip(
    name: String = "Ледокол",
    speed: Int = 100,
    numerOfPassengers: Int = 30,
    val isCanCrushIce: Boolean = true,
    val capacity: Int = 50,
) : LinerShip(
    speed = speed,
    name = name,
    numerOfPassengers = numerOfPassengers,
)

class CargoShip(
    name: String = "Грузовой",
    speed: Int = 150,
    numerOfPassengers: Int = 10,
    val carrying: Int = 150,
) : LinerShip(
    speed = 100,
    name = "Грузовой",
    numerOfPassengers = numerOfPassengers,
)