package Lesson_22

fun main() {

    // class vs data class
    // equals() - сравнение двух объектов
    // hashCode() - уникальный код объекта
    // toString() - строкове представление
    // cope() - копирование объекта

    val word1 = Word("Red", "Красный")
    val word2 = Word("Red", "Красный")
    val word3 = Word("White", "Белый")
    println(word1 == word2)

    val word4 = word3.copy(translate = "Правильно: Белый")
    println(word3)
    println(word4)

    println(word1.hashCode())
    println(word2.hashCode())
}

data class Word(
    val text: String,
    val translate: String,
)