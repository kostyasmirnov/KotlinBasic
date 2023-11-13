package Lesson_5

import Lesson_4.AGE_OF_MAJORITY

fun main() {

    val userAge = readLine()!!.toInt()

    if (userAge >= AGE_OF_MAJORITY) {
        println("show content")
    } else if (userAge == 16 || userAge == 17) {
        println("show not full content ")
    }
    else {
        //println("back to main window")
    }


    /**
     * if else могут возвращать значение
     * альтернативное написание кода выше:
     */

    val result = if (userAge >= AGE_OF_MAJORITY) "show content"
    else if (userAge == 16 || userAge == 17) "show not full content "
    else "back to main window"
    //println(result)

    // конструкция when

    val consoleNumber = when(userAge) {
        10 -> {
            println("dlc move")
            "10"
        }

        20 -> "20"
        42 -> "42"
        else -> "try another number"
    }
        println(consoleNumber)
}


const val AGE_OF_MAJORITY = 18