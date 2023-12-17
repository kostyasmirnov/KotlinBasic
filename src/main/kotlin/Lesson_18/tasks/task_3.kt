package Lesson_18.tasks

fun main() {

    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кот")

    val tamagotchis = arrayOf(fox, dog, cat)

    tamagotchisActivity(tamagotchis)

}

abstract class Tamagotchi(
    val name: String,
) {

    open fun play() = "$name - играет"

    open fun sleep() = "$name - спит"

    abstract fun eat(): String

}

class Fox(
    name: String,
) : Tamagotchi(name) {

    override fun eat(): String = "$name - ест ягоды"

}

class Dog(
    name: String,
) : Tamagotchi(name) {

    override fun eat(): String = "$name - ест косточки"

}

class Cat(
    name: String,
) : Tamagotchi(name) {

    override fun eat(): String = "$name - ест рыбку"

}

fun tamagotchisActivity(tamagotchis: Array<Tamagotchi>) {
    tamagotchis.forEach {
        println(it.play())
        println(it.sleep())
        println(it.eat())
    }
}

