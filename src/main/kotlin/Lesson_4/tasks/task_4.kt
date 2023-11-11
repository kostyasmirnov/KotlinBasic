package Lesson_4.tasks

fun main() {

    var currentDay = 1

    val armDay: String = "Упражнения для рук:"
    val legDay: String = "Упражнения для ног:"
    val backDay: String = "Упражнения для спины:"
    val pressDay: String = "Упражнения для пресса:"
    val group: Boolean = currentDay % 2 == 1

    var resultInfo = """
        $armDay   ${group}
        $legDay   ${!group}
        $backDay  ${!group}
        $pressDay ${group}
    """
    println(resultInfo)
}