package Lesson_5.tasks




fun main() {

    val secretNumber1 = (0..42).random()
    val secretNumber2 = (0..42).random()
    val secretNumber3 = (0..42).random()

    println(WELCOME_MESSAGE)
    println(ENTER_FIRST_NUMBER)
    val userNumber1 = readLine()!!.toInt()
    println(ENTER_SECOND_NUMBER)
    val userNumber2 = readLine()!!.toInt()
    println(ENTER_THIRD_NUMBER)
    val userNumber3 = readLine()!!.toInt()

    val isAllConditionsTrue: Boolean = ((secretNumber1 == userNumber1 || secretNumber1 == userNumber2 || secretNumber1 == userNumber3)
            && (secretNumber2 == userNumber2|| secretNumber2 == userNumber1 || secretNumber2 == userNumber3)
            && (secretNumber3 == userNumber3|| secretNumber3 == userNumber2 || secretNumber3 == userNumber1))
    val isTwoConditionsTrue: Boolean = ((secretNumber1 == userNumber1 || secretNumber1 == userNumber2 || secretNumber1 == userNumber3)
            || (secretNumber2 == userNumber2|| secretNumber2 == userNumber1 || secretNumber2 == userNumber3)
            && (secretNumber3 == userNumber3|| secretNumber3 == userNumber2 || secretNumber3 == userNumber1))
    val isOneConditionsTrue: Boolean = ((secretNumber1 == userNumber1 || secretNumber1 == userNumber2 || secretNumber1 == userNumber3)
            || (secretNumber2 == userNumber2|| secretNumber2 == userNumber1 || secretNumber2 == userNumber3)
            || (secretNumber3 == userNumber3|| secretNumber3 == userNumber2 || secretNumber3 == userNumber1))

    if (isAllConditionsTrue) println(THREE_CONDITIONS_TRUE)
    else if (isTwoConditionsTrue) println(TWO_CONDITIONS_TRUE)
    else if (isOneConditionsTrue) println(ONE_CONDITIONS_TRUE)
    else println(NO_ONE_CONDITIONS_TRUE)

    println(END_GAME_MESSAGE + secretNumber1 + ", " + secretNumber2 + ", " + secretNumber3)
}

const val WELCOME_MESSAGE = "Угадайте три числа от 0 до 42"
const val ENTER_FIRST_NUMBER = "Введите первое число: "
const val ENTER_SECOND_NUMBER = "Введите второе число: "
const val ENTER_THIRD_NUMBER = "Введите третье число: "
const val THREE_CONDITIONS_TRUE = "Вы угадали все три числа и выиграли джекпот!"
const val TWO_CONDITIONS_TRUE = "Вы угадали 2 числа и получаете крупный приз!"
const val ONE_CONDITIONS_TRUE = "Вам пологается утешительный приз!"
const val NO_ONE_CONDITIONS_TRUE = "Вы не угадали ни одного числа."
const val END_GAME_MESSAGE = "Загаданые числа были: "



