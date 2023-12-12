package Lesson_17

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTraslated}")
//    fish.nerveSignalLevel = 400
//    println("new value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTraslated}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLevel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLevel}")

}