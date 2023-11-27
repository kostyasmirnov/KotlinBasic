package Lesson_9.tasks


fun main() {

    val ingredientsList = mutableListOf("помидор", "картошка", "укроп")
    println(INGREDIENTS_LIST)
    ingredientsList.forEach { println(it) }

    println(IS_ADD_NEW)
    val isNeedAddNewIngredient = readln().toString()
    if (isNeedAddNewIngredient.equals("да", ignoreCase = true)) println(NEW_INGREDIENT)
    else return

    val newIngredient = readln().toString()
    ingredientsList.add(newIngredient)

    println(NEW_INGREDIENTS_LIST)
    ingredientsList.forEach { println(it) }
}

const val INGREDIENTS_LIST = "В рецепте есть базовые ингредиенты: "
const val IS_ADD_NEW = "Желаете добавить еще?"
const val NEW_INGREDIENT = "Какой ингредиент вы хотите добавить?"
const val NEW_INGREDIENTS_LIST = "Теперь в рецепте есть следующие ингредиенты: "
