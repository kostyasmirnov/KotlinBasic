package Lesson_4.tasks

fun main() {

    println("Груз с весом $fishKg кг и объемом $milkLiter л соответствует категории 'Average': " +
    "${(minWeight > fishKg && fishKg < maxWeight) && (milkLiter < maxLiters)}")
    println("Груз с весом $goldKg кг и объемом $waterLiter л соответствует категории 'Average': " +
            "${(minWeight >= goldKg && goldKg <= maxWeight) && (waterLiter < maxLiters)}")

}

const val fishKg = 20
const val milkLiter = 80
const val goldKg = 50
const val waterLiter = 100

const val maxLiters = 100
const val maxWeight = 100
const val minWeight = 35