package Lesson_5.tasks



fun main() {

    val numberForWin1 = 42
    val numberForWin2 = 0

    println("Угадайте 2 числа для выиграша в лотереи!\n" +
            "Введите первое число:")
    val number1 = readln()!!.toInt()
    println("Введите второе число:")
    val number2 = readln()!!.toInt()

    val trueBothConditions: Boolean = ((number1 == numberForWin1) && (number2 == numberForWin2) || (number2 == numberForWin1) && (number1 == numberForWin2))
    val trueOneConditions = ((number1 == numberForWin2) || (number2 == numberForWin1) || (number1 == numberForWin2) || (number2 == numberForWin1))

    if (trueBothConditions) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (trueOneConditions) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("\nДля победы необходимо было ввести числа от $numberForWin2 до $numberForWin1")
}
