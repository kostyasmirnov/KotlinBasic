package Lesson_17.tasks

fun main() {

    val folder1 = Folder("Работа", 5, true)
    val folder2 = Folder("Учеба", 12, false)
    println("${folder1.displayName}, ${folder1.displayFileCount}")
    println("${folder2.displayName}, ${folder2.displayFileCount}")
}

class Folder(
    val name: String,
    val countOfFiles: Int,
    val isSecret: Boolean,
) {

    val displayName: String
        get() = if (isSecret) "скрытая папка"
        else name


    val displayFileCount: Int
        get() = if (isSecret) 0
        else countOfFiles

}