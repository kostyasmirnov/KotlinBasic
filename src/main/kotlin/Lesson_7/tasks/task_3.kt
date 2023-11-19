package Lesson_7.tasks

fun main() {

    println(WELCOME_MESSAGE)
    val number = readln().toInt()
    for (i in 0..number step 2) {
        println(i)
    }

}

const val WELCOME_MESSAGE = "Введите целое число : "