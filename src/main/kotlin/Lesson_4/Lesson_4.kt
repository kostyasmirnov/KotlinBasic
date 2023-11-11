package Lesson_4

fun main() {

    // логические операторы
    // операторы сравнения

    val a = 1 + 1
    val b = (1 == 1)

    // <, >, >=, <=, ==, !=
    // true
    // false

    // ===, !== (операторы ссылочного сравнения)
    // %%, ||, ! (логические операторы)

    val userAge = 18
    //var comparisonResult = (userAge >= AGE_OF_MAJORITY) || !(userAge <= RETIREMENT_AGE)
    var comparisonResult = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("Результат проверки возраста пользака: $comparisonResult")

//    println(0 < -1)//false
//    println(1 == 1)//true
//    println(2 == 3)//false
//    println(7 != 8)//true

//    val cd = true
//    val d = !a
//    //println(d)


}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65