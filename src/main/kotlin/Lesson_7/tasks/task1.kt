package Lesson_7.tasks

fun main() {

    var password: String = ""
    for (i in 1..3) {
        password += (0..9).random()
        password += ('a'..'z').random()
    }
    println(password)

}