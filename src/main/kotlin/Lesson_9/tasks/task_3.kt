package Lesson_9.tasks

fun main() {

    val ingredientsList = mutableListOf(2, 50, 15)
    println("Введите количество порций: ")
    val numberOfServings = readln().toInt()
    val newIngredientsList = ingredientsList.map { it * numberOfServings}
    println("На $numberOfServings порций вам понадобится: \nяиц - ${newIngredientsList[0]} шт, молока - ${newIngredientsList[1]} мл, сливочного масла - ${newIngredientsList[2]} гр")

}