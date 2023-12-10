package Lesson_14.tasks


fun main() {

    val phobos: Satellite = Satellite("Фобос", isAtmosphere = false, isCanBeDisembarkation = true)
    val deimos: Satellite = Satellite("Деймос", isAtmosphere = false, isCanBeDisembarkation = false)
    val marsPlanet: Planet = Planet("Марс", isAtmosphere = true, isCanBeDisembarkation = true, satellite = mutableListOf(phobos, deimos))

    println("У планеты: ${marsPlanet.name} есть спутники:")
    for (satellites in marsPlanet.satellite) {
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
    val satellite: List<Satellite> = mutableListOf()
) : CelestialBody(name, isAtmosphere, isCanBeDisembarkation)

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isCanBeDisembarkation: Boolean,
) : CelestialBody(name, isAtmosphere, isCanBeDisembarkation)