package Lesson_9.tasks

fun main() {

    println(WELCOME_MESSAGE)
    val inputIngredients = readln().toString()
    val ingredientsList = mutableListOf("")

    if (ingredientsList != null) ingredientsList += inputIngredients.split(',', ' ').sorted()
    println(SORTED_MESSAGE)
    ingredientsList.forEach { println(it) }


}

const val WELCOME_MESSAGE = "Введите 5 ингридентов блюда в одной строке, разделяя их запятыми с пробелом: "
const val SORTED_MESSAGE = "Отсортированные ингриденты: "