package Lesson_11.tasks

import Lesson_10.getName


fun main() {

    val CategoryOfBurger = Categories(
        1, "Бургеры.png", "Рецепты всех популярных видов бургеров",
        "Бургеры", "бургеры.png"
    )
    val classicHamburger = Recipes(
        1, "Классический гамбургер", name = "Бургеры.png", "классический_гамбургер.пнг"
    )


    CategoryOfBurger.getAvatar()
    CategoryOfBurger.getDescription()
    CategoryOfBurger.openCategories(CategoryOfBurger.name)
    println()
    classicHamburger.getAvatarRecipe()
    classicHamburger.openRecipe(classicHamburger.name)
    println()
    classicHamburger.getIngredients()
    classicHamburger.countIngredients()



}

class Categories(
    val id: Int = 1,
    val screenHeader: String = "Категории.png",
    private val description: String = "Рецепты всех популярных видов бургеров",
    val name: String = "Бургеры",
    private val avatar: String,
) {
    fun openCategories(name: String) {
        println("Переход на экран категорий \"$name\"")
    }

    fun getDescription(): String {
        return description
    }

    fun getAvatar(): String {
        return avatar
    }
}

class Recipes(
    val id: Int = 1,
    val screenHeader: String = "Бургеры",
    val name: String = "",
    private val avatarRecipe: String = "",
) : Ingredients(mutableListOf("булка 2", "сыр 4", "помидор 50", "котлета гриль 300"), true, 1) {
    fun openRecipe(name: String) {
        println("Открытие экрана с рецептами \"$name\"")
    }

    fun getAvatarRecipe(): String {
        return avatarRecipe
    }
}

open class Ingredients(
    private val ingredients: List<String>,
    val isFavorites: Boolean = false,
    private val count: Int = 1,
) {

    fun getIngredients() {
        ingredients.forEach { println(it) }
    }

    fun countIngredients() {
        println(COUNT_SLIDER_MESSAGE)
        val countSlider = readln().toInt()
        val updatedList = ingredients.map {
            ingredients ->
            val parts = ingredients.split(" ")
            val name = parts.dropLast(1).joinToString(" ")
            val quantity = parts.last().toInt() * countSlider
            "$name $quantity шт"
        }
        updatedList.forEach { println(it) }
    }
}

const val COUNT_SLIDER_MESSAGE = "Введите количество ингредиентов: "