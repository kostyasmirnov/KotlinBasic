package Lesson_6.tasks

fun main() {

    println(WELCOME_MESSAGE_SECONDS)
    val secondsFromUser = readln().toLong()

    Thread.sleep(secondsFromUser * 1000)
    println("Прошло $secondsFromUser секунд")

}

const val WELCOME_MESSAGE_SECONDS: String = "Сколько секунд необходимо засечь?"