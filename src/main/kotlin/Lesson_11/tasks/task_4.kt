package Lesson_11.tasks


fun main() {

    val categoryOfBurger = Category(
        1, "Рецепты всех популярных видов бургеров",
        "Бургеры", "бургеры.png"
    )
    val ingredients = Ingredient(
        mutableListOf("булка 2", "сыр 4", "помидор 50", "котлета гриль 300"),
        true, 3, "ФотоБургера.png"
    )
    val classicHamburger = Recipe(
        1, "Классический гамбургер", "Бургеры", "Бургер.png", ingredients
    )

}

class Category(
    val id: Int = 1,
    private val description: String = "Рецепты всех популярных видов бургеров",
    val name: String = "Бургеры",
    private val previewImage: String,
)

class Recipe(
    val id: Int = 1,
    val screenHeader: String = "Бургеры",
    val name: String = "",
    private val previewImage: String = "",
    val ingredients: Ingredient,
)

class Ingredient(
    private val ingredients: List<String> = mutableListOf("булка 2", "сыр 4", "помидор 50", "котлета гриль 300"),
    val isFavorites: Boolean = false,
    private val count: Int = 1,
    val screenHeader: String,
) {

    fun getIngredients() {
        ingredients.forEach { println(it) }
    }

    fun countIngredients() {
        println(COUNT_SLIDER_MESSAGE)
        val countSlider = readln().toInt()
        val updatedList = ingredients.map { ingredients ->
            val parts = ingredients.split(" ")
            val name = parts.dropLast(1).joinToString(" ")
            val quantity = parts.last().toInt() * countSlider
            "$name $quantity шт"
        }
        updatedList.forEach { println(it) }
    }
}

const val COUNT_SLIDER_MESSAGE = "Введите количество ингредиентов: "