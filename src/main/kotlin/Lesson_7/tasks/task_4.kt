package Lesson_7.tasks

fun main() {

    println(WELCOME_MESSAGE_FOR_TASK4)
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println(TIME_END)
}

const val WELCOME_MESSAGE_FOR_TASK4 = "Сколько секунд нужно засечь?"
const val TIME_END = "Время вышло"