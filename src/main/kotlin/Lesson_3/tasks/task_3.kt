package Lesson_3.tasks

fun main() {

    /**
     * объявить и пронициализировать переменную
     * а выводиться будет табл умножения
     * таблица должна корректно печтатаься если в исход переменную подставить any числа
     *
     * вычислять значнеия прямо в строке
     * вывод все йтабл нужно сделать в 1 func print которая вызывается они риз
     */

    val number: Int = 4

    val multiplication: String = """
        $number x 1 = ${number * 1}
        $number x 2 = ${number * 2}
        $number x 3 = ${number * 3}
        $number x 4 = ${number * 4}
        $number x 5 = ${number * 5}
        $number x 6 = ${number * 6}
        $number x 7 = ${number * 7}
        $number x 8 = ${number * 8}
        $number x 9 = ${number * 9}
    """.trimIndent()

    println(multiplication)
}