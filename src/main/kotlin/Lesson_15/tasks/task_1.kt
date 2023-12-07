package Lesson_15.tasks


fun main() {

    val crucain1: Crucain = Crucain()
    val gull1: Gull = Gull()
    val duck1: Duck = Duck()

    crucain1.swimming()
    gull1.flying()
    duck1.swimming()
    duck1.flying()

}

class Crucain : Swiming {

    val name: String = "Карась"

    override fun swimming() {
        println("$name плавает")
    }
}

class Gull : Flying {

    val name: String = "Чайка"
    override fun flying() {
        println("$name летает")
    }

}

class Duck : Flying, Swiming {

    val name: String = "Утка"
    override fun flying() {
        println("$name летает")
    }

    override fun swimming() {
        println("$name плавает")
    }
}

interface Flying {

    fun flying()

}

interface Swiming {

    fun swimming()

}