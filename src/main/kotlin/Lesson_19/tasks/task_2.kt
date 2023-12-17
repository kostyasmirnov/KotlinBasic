package Lesson_19.tasks

fun main() {

    val coat = Product("Пальто", 1, ShopCategory.CLOTH)
    coat.getInfoAboutProduct()
}

enum class ShopCategory {
    CLOTH,
    STATIONERY,
    Other;

    open fun getNameCategory(category: ShopCategory): String {
        return when (category) {
            ShopCategory.CLOTH -> "Одежда"
            ShopCategory.STATIONERY -> "Канцелярские товары"
            ShopCategory.Other -> "Разное"
        }
    }

}

class Product(
    private val name: String,
    private val id: Int,
    private val category: ShopCategory,
) {

    fun getInfoAboutProduct() {
        println("$name из категории ${category.getNameCategory(category)}, Его номер: $id")
    }
}