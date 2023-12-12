package Lesson_17.tasks

fun main() {

    val folder1 = Folder(true)
    val folder2 = Folder(false)
    println("${folder1.name}, ${folder1.countOfFiles}")
    println("${folder2.name}, ${folder2.countOfFiles}")
}

class Folder(
    val isSecret: Boolean,
) {

    var name: String = "Работа"
        get() {
            if (isSecret) return "скрытая папка"
            else return field
        }
    var countOfFiles: Int = 10
        get() {
            if (isSecret) return 0
            else return field
        }

}