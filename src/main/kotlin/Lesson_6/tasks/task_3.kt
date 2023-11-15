package Lesson_6.tasks

fun main() {

    println(WELCOME_MESSAGE_SECONDS)
    var secondsFromUser = readln().toInt()

    while (secondsFromUser > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $secondsFromUser")
        secondsFromUser--
    }
    Thread.sleep(1000)
    println("Время вышло")

}

const val WELCOME_MESSAGE_SECONDS: String = "Сколько секунд необходимо засечь?"