package Lesson_9.tasks

fun main() {

    val ingredientsList = mutableListOf("помидор", "картошка", "укроп", "огурец", "кола")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach {
        println(it)
    }

}