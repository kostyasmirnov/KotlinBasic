package Lesson_17.tasks

fun main() {

    val quiz = Quiz()
    println(quiz.question)
    println(quiz.answer)
}

class Quiz {

    var question: String = "когда обед?"
        set(value) {
            field = value
        }

    var answer: String = "когда отработаешь."
        get() = field
        set(value) {
            field = value
        }

}