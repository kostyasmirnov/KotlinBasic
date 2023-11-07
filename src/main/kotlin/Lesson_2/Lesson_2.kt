package Lesson_2

fun main() {

    val a = 5
    val b = 7
    val sum = a + b

    val c1 = 888
    val c2: Int

    //println(a + b)
    //println(sum)
    //println(10 / 3)

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)

    // остаток от деления == %

//    println(10 % 3)
//    println(10 % 2)

    //конечный тип переменной
    println("NEW")
    val c = intNum1 + floatNum1
    println(c::class.simpleName) //float

    val d = intNum1 + floatNum1 + doubleNum1
    println(d::class.simpleName) // double

        // инкремент, декремент

    var counter = 0

    counter = counter + 1
    counter += 1
    counter ++

    println(counter)

    counter -= 1
    counter--

    ++counter
    --counter

    // операторы сравнения

    println("kekwaitet")
    println(a > b)
    println(a < b)
    println(a <= b)
    println(a >= b)
    println(a == b)
    println(a != b)


}