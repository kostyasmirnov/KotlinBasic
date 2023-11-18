package Lesson_7.tasks

fun main() {

    var password: String = ""

    for (i in 1..3) {
        val randomNumbers = (0..9).random()
        val randomLetters = ('a'..'z').random()
        password += randomLetters
        password += randomNumbers
    }
    println(password)

}