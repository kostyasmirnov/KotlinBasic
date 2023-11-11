package Lesson_4.tasks

fun main() {

    val fishKg = 20
    val milkLiter = 80
    val goldKg = 50
    val waterLiter = 100

    val maxLiters = 100
    val maxWeight = 100
    val minWeight = 35

    println("Груз с весом $fishKg кг и объемом $milkLiter л соответствует категории 'Average': " +
    "${(minWeight > fishKg && fishKg < maxWeight) && (milkLiter < maxLiters)}")
    println("Груз с весом $goldKg кг и объемом $waterLiter л соответствует категории 'Average': " +
            "${(minWeight > goldKg && goldKg < maxWeight) && (waterLiter < maxLiters)}")

}