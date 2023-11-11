package Lesson_2.tasks

fun main() {

    val minedCrystalOre: Int = 7
    val minedIronOre: Int = 11

    val buff: Int = 20

    var buffedMinedCrystals = minedCrystalOre * buff
    val buffedMinedIron = minedIronOre * buff

    println("Добыто кристаллической руды под действием баффа: " + buffedMinedCrystals / 100)
    println("Добыто железной руды под действием баффа: " + buffedMinedIron / 100)

}