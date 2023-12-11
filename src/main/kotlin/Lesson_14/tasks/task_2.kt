package Lesson_14.tasks


fun main() {

    val linerShip1 = LinerShip2()
    val iceBreakerShip1 = IceBreakerShip2()
    val cargoShip1 = CargoShip2()

    val list: List<LinerShip2> = mutableListOf(linerShip1, iceBreakerShip1, cargoShip1)
    list.forEach { it.loadingLiner() }
    list.forEach { it.printInfo() }

}

open class LinerShip2(
    val speed: Int = 200,
    val name: String = "Лайнер",
    val numberOfPassengers: Int = 200,
) {

    open fun loadingLiner() {
        println("Корабль $name: выдвигает горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("\n$name имеет: \n-Скорость = $speed\n-Колличество поссажиров = $numberOfPassengers")
    }

}

class IceBreakerShip2(
    name: String = "Ледокол",
    speed: Int = 100,
    numerOfPassengers: Int = 30,
    val isCanCrushIce: Boolean = true,
    val capacity: Int = 50,
) : LinerShip2(
    speed = speed,
    name = name,
    numberOfPassengers = numerOfPassengers,
) {

    override fun loadingLiner() {
        println("Корабль $name: открывает ворота со стороны кормы")
    }

    override fun printInfo() {
        super.printInfo()
        print("-Может ли колоть лед? = $isCanCrushIce\n-Вместительность = $capacity\n")
    }

}

class CargoShip2(
    name: String = "Грузовой",
    speed: Int = 150,
    numerOfPassengers: Int = 10,
    val carrying: Int = 150,
) : LinerShip2(
    speed = 100,
    name = "Грузовой",
    numberOfPassengers = numerOfPassengers,
) {

    override fun loadingLiner() {
        println("Корабль $name: активирует погрузочный кран")
    }

    override fun printInfo() {
        super.printInfo()
        print("-Грузоподъемность = $carrying\n")
    }

}