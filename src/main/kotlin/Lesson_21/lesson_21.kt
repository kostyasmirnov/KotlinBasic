package Lesson_21

import java.io.File

val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")
fun main() {

    val file = File("textFile.txt")
    file.writeToFileAndSend()
    file.writeText("privet")

}

fun File.writeToFileAndSend() {

    val  message = "some message for file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send")

}