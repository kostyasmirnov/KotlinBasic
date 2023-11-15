package Lesson_6.tasks

fun main() {

    println(WELCOME_MESSAGE_SECONDS)
    val secondsFromUser = readln().toInt()
    var counter: Int = 0

    do {
        Thread.sleep(1000)
        counter++
    } while (counter < secondsFromUser)
    println("Прошло $secondsFromUser секунд")

}

const val WELCOME_MESSAGE_SECONDS: String = "Сколько секунд необходимо засечь?"