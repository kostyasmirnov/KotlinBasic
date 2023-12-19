package Lesson_22.tasks

fun main() {

    val regularBook1 = RegularBook("Капитанская дочка", "А.С. Пушкин")
    val regularBook2 = RegularBook("Капитанская дочка", "А.С. Пушкин")

    val dataBook1 = DataBook("Капитанская дочка", "А.С. Пушкин")
    val dataBook2 = DataBook("Капитанская дочка", "А.С. Пушкин")

    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)

    /**
     * В случае с классом RegularBook, результат сравнения будет false, тк сраниваются ссылки на объекты
     *
     * В случае с DataBook, результат будет true, тк сравнивается сами объекты. Data class автоматически
     * создает методы equals(), что позволяет корректно сравнивать объекты на основе их свойств
     */
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)