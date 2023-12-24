package Lesson_22.tasks

fun main() {

    val regularBook = RegularBook2("Regular Book", "John Doe")
    val dataBook = DataBook2("Data Book", "Jane Smith")

    // Выводим объекты целиком в консоль
    println("Regular Book: $regularBook") // Выводит адрес объекта в памяти (хэш-код)
    println("Data Book: $dataBook") // Выводит значения полей объекта

    /**
   Класс RegularBook2 является обычным классом (не data class), поэтому при выводе в консоль по умолчанию будет отображаться адрес объекта в памяти (хэш-код).
   В случае с DataBook2, поскольку это data class, при выводе в консоль автоматически отображаются значения полей объекта.
   */

}

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)