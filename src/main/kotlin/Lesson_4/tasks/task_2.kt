package Lesson_4.tasks

fun main() {

    val fishKg = 20
    val milkLiter = 80
    val goldKg = 50
    val waterLiter = 100

    println("Груз с весом $fishKg кг и объемом $milkLiter л соответствует категории 'Average': " +
    "${(MIN_WEIGHT >= fishKg && fishKg <= MAX_WEIGHT) && (milkLiter < MAX_LITERS)}")
    println("Груз с весом $goldKg кг и объемом $waterLiter л соответствует категории 'Average': " +
            "${(MIN_WEIGHT >= goldKg && goldKg <= MAX_WEIGHT) && (waterLiter < MAX_LITERS)}")

}

const val MAX_LITERS = 100
const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35