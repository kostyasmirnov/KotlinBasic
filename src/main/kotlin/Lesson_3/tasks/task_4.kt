package Lesson_3.tasks

fun main() {

    var from: String = "E2"
    var where: String = "E4"
    var numberOfMove: Int = 1

    var stringForServer = "[$from:$where; $numberOfMove]"
    println(stringForServer)
    from = "D2"
    where = "D4"
    numberOfMove = 2
    stringForServer = "[$from:$where; $numberOfMove]"
    println(stringForServer)

}
