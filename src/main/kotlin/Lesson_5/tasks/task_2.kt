package Lesson_5.tasks


fun main() {

    val userYearOfBirth = readln()!!.toInt()

    val result = if (YEAR_NOW - userYearOfBirth >= MIN_AGE_USER ) "Показать экран со скрытым контентом"
    else "Доступ запрещен"
    println(result)

}

const val YEAR_NOW = 2023
const val MIN_AGE_USER = 18
