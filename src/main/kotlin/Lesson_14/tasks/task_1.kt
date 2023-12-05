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
    //val isCanCrushIce: Boolean = false,
    //val carrying: Int = 0, //грузоподъемность
)

class IceBreakerShip(
    name: String = "Ледокол",
    speed: Int = 100,
    val isCanCrushIce: Boolean = true,
    val capacity: Int = 50,
) : LinerShip(
    speed = speed,
    name = name
)

class CargoShip(
    name: String = "Грузовой",
    speed: Int = 150,
    val carrying: Int = 150,
) : LinerShip(
    speed = 100,
    name = "Грузовой"
)