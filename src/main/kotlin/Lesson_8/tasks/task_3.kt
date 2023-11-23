package Lesson_8.tasks

import java.util.*

fun main() {

    val ingredients:Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println(SEARCH_INGREDIENT_MESSAGE)
    val userRequest = readln().lowercase(Locale.getDefault())
    if (userRequest in ingredients) println("Ингридиент $userRequest в рецепте есть")
    else println("Ингридиента в рецепте нет")

}

const val SEARCH_INGREDIENT_MESSAGE = "Какой ингридиент вы хотели бы найти?"
