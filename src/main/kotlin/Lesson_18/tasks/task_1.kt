package Lesson_18.tasks

fun main() {

    val order1 = Order()
    val order2 = Order()

    order1.printOrderInfo(1, "Гречка")
    order2.printOrderInfo(1, listOf("Сметана", "Зелень"))
}

class Order {

    fun printOrderInfo(
        number: Int,
        product: String,
    ) {
        println("Заказан товар: [$product]")
    }

    fun printOrderInfo(
        number: Int,
        products: List<String>
    ) {
        println("Заказаны следующие товары: $products")
    }

}