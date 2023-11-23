package Lesson_8.tasks

import java.util.*

fun main() {

    val ingredients:Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println(SEARCH_INGREDIENT_MESSAGE)
    val userRequest = readln()
    for (i in ingredients) {
        if (userRequest.lowercase(Locale.getDefault()) == i)
            return println("Ингридиент $i в рецепте есть")
    }
    println("Ингридиента в рецепте нет")

}

const val SEARCH_INGREDIENT_MESSAGE = "Какой ингридиент вы хотели бы найти?"