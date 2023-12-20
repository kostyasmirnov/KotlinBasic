package Lesson_21.tasks

fun main() {

    val word: String = "hello"
    println(word.vowelCount(word))

}

fun String.vowelCount(input: String): Int {

    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return input.count { it in vowels }

}