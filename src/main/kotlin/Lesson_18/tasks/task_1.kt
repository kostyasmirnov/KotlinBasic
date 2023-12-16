package Lesson_18.tasks

fun main() {

    val order1 = Order()
    val order2 = Order()

    order1.infoAboutOrder(1, "Гречка")
    order2.infoAboutOrder(1, listOf("Сметана", "Зелень"))
}

class Order {

    fun infoAboutOrder(
        number: Int,
        product: String,
    ) {
        println("Заказан товар: [$product]")
    }

    fun infoAboutOrder(
        number: Int,
        products: List<String>
    ) {
        println("Заказаны следующие товары: $products")
    }

}