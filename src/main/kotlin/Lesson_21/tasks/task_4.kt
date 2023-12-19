package Lesson_21.tasks

import java.io.File
import java.io.FileWriter

fun main() {

    val file = File("KS21_4.text")
    file.writeText("строка№1\nстрока№2")
    file.writeToFile("Satoru Gojo")
}

fun File.writeToFile(word: String) {

    val content = readText()
    val newContent = word.lowercase() + content
    FileWriter(this).use { it.write(newContent) }

}