package Lesson_7

fun main() {

    // диапазоны (интервалы)

    val range1 = 42..442
    val range2 = 42 until 442
    val range3 = 42L..442L
    val range4 = 'a'..'z'
    val range5 = 42.1..442.1
    val range6 = 41.1f..442.1f
    val range7 = 42..442 step 2
    val range8 = 42 downTo 42 step 2

    //in, !in

    val a = 52 in range1
    val b = 52 !in range1
    println(a)
    println(b)

    // for - цикл
    // break, continue, return

    for(i in 5 downTo 1) {
        if (i == 3) {
//            println("skipped")
//            break
//            println("i == 3, i dont be printed")
//            continue
            return
        }
        println("some text $i")
        Thread.sleep(1000)
    }
    println("continue")
    //for (i in range2 step 8) println(i)

}