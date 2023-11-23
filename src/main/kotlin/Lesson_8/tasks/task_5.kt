package Lesson_8.tasks

fun main() {

    /**
     * Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить пользователь.
     *
     * - элементы вводятся по одному;
     * - перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
     * - запрещено использовать список или динамический массив.
     */

    println(HOW_MANY_INGREDIENTS)
    val ingredientCount = readLine()?.toIntOrNull()

    if (ingredientCount != null && ingredientCount > 0) {
        val ingredients = Array(ingredientCount) { "" }

        for (i in 0 until ingredientCount) {
            println("Введите ингредиент ${i + 1}:")
            ingredients[i] = readLine().toString()
        }

        println("Список ингредиентов:")
        for (ingredient in ingredients) {
            println(ingredient)
        }
    } else {
        println("Некорректное количество ингредиентов")
    }
}

const val HOW_MANY_INGREDIENTS = "Укажите количество ингридиентов"