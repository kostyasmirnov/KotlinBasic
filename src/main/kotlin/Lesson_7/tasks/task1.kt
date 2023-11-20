package Lesson_7.tasks

fun main() {

    var password: String = ""
    val randomNumbers = (0..9).random()
    val randomLetters = ('a'..'z').random()
    for (i in 1..3) {
        password += randomNumbers
        password += randomLetters
    }
    println(password)

}