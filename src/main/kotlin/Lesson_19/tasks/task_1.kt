package Lesson_19.tasks

fun main() {

    println(MESSAGE_FISH)
    for (i in Fish.entries) println(i.fish)
}

enum class Fish(val fish: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотоая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

const val MESSAGE_FISH = "Этих рыб можно добавить в аквариум:"