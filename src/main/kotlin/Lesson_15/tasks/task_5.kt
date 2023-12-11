package Lesson_15.tasks

fun main() {

    val nissanSkyline: PassengerCar = PassengerCar(1, "Ниссан скайлайн")
    val hyundaiHD78: CargoCar = CargoCar(2, "Hyundai HD78")

    nissanSkyline.loadPassanger(nissanSkyline.name, 6)
    nissanSkyline.loadPassanger(nissanSkyline.name, 3)
    hyundaiHD78.loadCargo(hyundaiHD78.name, 1900)

    nissanSkyline.movePassengerCar(nissanSkyline.name, nissanSkyline.countOfPassengers, nissanSkyline.maxPassengers)
    hyundaiHD78.moveCargoCar(hyundaiHD78.name, hyundaiHD78.countOfCargo, hyundaiHD78.maxCargo)

    nissanSkyline.unloadPassanger(nissanSkyline.name, 3)
    hyundaiHD78.unloadCargo(hyundaiHD78.name, 1900)
}

abstract class Car(
    val id: Int,
    val name: String,
)

class PassengerCar(
    id: Int,
    name: String,
    val countOfPassengers: Int = 0, override val maxPassengers: Int = 3,
) : Car(id, name), TransportationOfPassenger, MovableCar {

    override fun movePassengerCar(name: String, countOfPassengers: Int, maxPassengers: Int) {
        super.movePassengerCar(name, countOfPassengers, maxPassengers)
    }

    override fun transportationPassengers(countOfPassengers: Int, name: String) {
        super.transportationPassengers(countOfPassengers, name)
    }

    override fun loadPassanger(name: String, countOfPassengers: Int) {
        super.loadPassanger(name, countOfPassengers)
    }

    override fun unloadPassanger(name: String, countOfPassengers: Int) {
        super.unloadPassanger(name, countOfPassengers)
    }
}

class CargoCar(
    id: Int,
    name: String,
    val countOfCargo: Int = 0, override val maxCargo: Int = 2000,
) : Car(id, name), TransportationOfCargo, MovableCar {

    override fun moveCargoCar(name: String, countOfCargo: Int, maxCargo: Int) {
        super.moveCargoCar(name, countOfCargo, maxCargo)
    }

    override fun transportationCargos(countOfCargo: Int, name: String) {
        super.transportationCargos(countOfCargo, name)
    }

    override fun loadCargo(name: String, countOfCargo: Int) {
        super.loadCargo(name, countOfCargo)
    }

    override fun unloadCargo(name: String, countOfCargo: Int) {
        super.unloadCargo(name, countOfCargo)
    }
}

interface MovableCar {

    fun movePassengerCar(name: String, countOfPassengers: Int, maxPassengers: Int) {
        if (countOfPassengers <= maxPassengers) println("Машина $name поехала в Германию")
        else println("Пассажаров больше $maxPassengers, движение невозможно")
    }

    fun moveCargoCar(name: String, countOfCargo: Int, maxCargo: Int) {
        if (countOfCargo <= maxCargo) println("Машина $name поехала в Испанию")
        else println("Груз весит больше чем $maxCargo тонн, движение невозможно")

    }
}

interface TransportationOfPassenger {

    fun transportationPassengers(countOfPassengers: Int, name: String) {
        println("$name едет с колличеством поссажиров = $countOfPassengers ")
    }

    fun loadPassanger(name: String, countOfPassengers: Int) {
        if (countOfPassengers <= maxPassengers) println("В $name село $countOfPassengers пассажира")
        else println("Для $name, $countOfPassengers пассажира слишком много")
    }

    fun unloadPassanger(name: String, countOfPassengers: Int) {
        println("Из $name вышло $countOfPassengers пассажира")
    }

    val maxPassengers: Int
}

interface TransportationOfCargo {

    fun transportationCargos(countOfCargo: Int, name: String) {
        println("$name едет с колличеством поссажиров = $countOfCargo ")
    }

    fun loadCargo(name: String, countOfCargo: Int) {
        if (countOfCargo <= maxCargo) println("В $name погружено $countOfCargo тонн груза")
        else println("Вес груза больше допустимого")
    }

    fun unloadCargo(name: String, countOfCargo: Int) {
        println("Из $name выгруженно $countOfCargo тонн груза")
    }

    val maxCargo: Int
}

