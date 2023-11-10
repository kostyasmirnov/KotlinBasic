package Lesson_3.tasks

fun main() {

    var stringFromUser = "D2-D4;0"

    var splittedString = stringFromUser.split("-",";")

    var from = splittedString[0]
    var where = splittedString[1]
    var numberOfMove = splittedString[2]

    println("Откуда: $from")
    println("Куда: $where")
    println("Номер хода: $numberOfMove")
}