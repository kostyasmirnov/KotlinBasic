package Lesson_14.tasks


fun main() {

    val phobos: Satellite = Satellite("Фобос", false, true)
    val deimos: Satellite = Satellite("Деймос", false, false)
    val marsPlanet: Planet = Planet("Марс", true, true)

    marsPlanet.satellites.add(phobos)
    marsPlanet.satellites.add(deimos)

    println("У планеты: ${marsPlanet.name} есть спутники:")
    for (satellites in marsPlanet.satellites) {
        println("-${satellites.name}")
    }

}

open class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isCanBeDisembarkation: Boolean,
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isCanBeDisembarkation: Boolean,
) : CelestialBody(name, isAtmosphere, isCanBeDisembarkation) {

    val satellites = mutableListOf<Satellite>()

}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isCanBeDisembarkation: Boolean,
) : CelestialBody(name, isAtmosphere, isCanBeDisembarkation)