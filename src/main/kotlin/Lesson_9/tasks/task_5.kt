package Lesson_9.tasks

import kotlin.math.max

fun main() {

    val ingredients = mutableSetOf<String>()
    var count = 1

    while (count <= 5) {
        println("Введите ингредиент №$count: ")
        val ingredient = readln().toString()

        if (ingredients.contains(ingredient)) println("Такой ингредиент уже добавлен, попробуйте другой")
        else
            ingredients.add(ingredient)
        count++
    }

    val ingredientsList = ingredients.sorted()
    println("Отсортированные ингредиенты: $ingredientsList")

}