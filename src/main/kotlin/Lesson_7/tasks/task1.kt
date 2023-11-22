package Lesson_7.tasks

fun main() {

    var password: String = ""
    val randomNumbers = (0..9)
    val randomLetters = ('a'..'z')
    for (i in 1..3) {
        password += randomNumbers.random()
        password += randomLetters.random()
    }
    println(password)

}