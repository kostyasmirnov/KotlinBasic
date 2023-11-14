package Lesson_4.tasks

fun main() {

    var currentDay = 1

    val armDay: String = "Упражнения для рук:"
    val legDay: String = "Упражнения для ног:"
    val backDay: String = "Упражнения для спины:"
    val pressDay: String = "Упражнения для пресса:"
    val isEvenDay: Boolean = currentDay % 2 == 0

    var resultInfo = """
        $armDay   ${isEvenDay}
        $legDay   ${!isEvenDay}
        $backDay  ${!isEvenDay}
        $pressDay ${isEvenDay}
    """
    println(resultInfo)
}