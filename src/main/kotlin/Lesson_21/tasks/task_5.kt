package Lesson_21.tasks

fun main() {

    val skills = mapOf(
        "Attack" to 150,
        "Defense" to 120,
        "Magic" to 200,
        "Agility" to 150
    )

    val maxSkill = skills.maxCategory()
    println("Максимальный скилл игрока: $maxSkill")

}

fun <K, V : Comparable<V>> Map<K, V>.maxCategory(): K? {

    return maxByOrNull { it.value }?.key

}