package Lesson_8.tasks

fun main() {

    var ingredients: Array<String> = arrayOf("капуста", "помидор", "зелень", "апельсин", "картошка")
    ingredients.forEach { println(it) }
    println(WELCOME_MESSAGE_FOR_TASK4)
    val requestToChangeIngredient = readln().toString()
    for (i in ingredients) {

    }
    if (!ingredients.contains(requestToChangeIngredient)) {
        println("Такого ингридиента у нас нет \"$requestToChangeIngredient\" ")
    } else {
        println(CHANGE_INGREDIENT)
        val newIngredientFromUser = readln().toString()
        ingredients[ingredients.indexOf(requestToChangeIngredient)] = newIngredientFromUser
        println("Готово! Вы сохранили следующий список: ")
        ingredients.forEach { println(it) }
    }
}

const val WELCOME_MESSAGE_FOR_TASK4 = "Введите ингридиент который желаете заменить"
const val CHANGE_INGREDIENT = "Какой ингридиент желаете добавить?"
