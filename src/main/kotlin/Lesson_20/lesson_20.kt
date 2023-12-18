package Lesson_20

import java.util.Calendar

fun main() {

    // анонимные функции
    // лямбды

    val calendar: Calendar = Calendar.getInstance()
    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear())
    val convertEnDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEnDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print string with lambda $answer"
    }

    println(printStringWithLambda(42));

    // короткая запись
    println({ it: Int -> "print string with lambda 2 $it" }(442))

    // конвертация дней в миллисекунды
    val convertLambda = {endDays: Int ->
        println("Covert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())

}