package Lesson_11

class Dish (
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {

    fun addToFavorites() {
        println("Bludo $name add to fav")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Bludo $name del from fav")
        inFavorites = false
    }

    fun startCooking() {
        println("user open layout where stater cooking $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }

}