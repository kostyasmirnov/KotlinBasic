package Lesson_19.tasks

fun main() {

    println(INSTRUCTIONS_MESSAGE.trimMargin())

    val humanList: MutableList<Human> = mutableListOf()

        for (i in 1..5) {
            println(INPUT_N)
            val inputName = readln()
            println(INPUT_S)
            val inputSex = readln()
            val getSex = getSex(inputSex)
            val human = Human(inputName, getSex)
            humanList.add(human)
        }

    humanList.forEach {
        println(it.name)
        println(it.sex.description)
    }
}

class Human(
    val name: String,
    val sex: Sex,
) {
}

enum class Sex(val description: String) {
    MAN("мужчина"),
    WOMEN("женщина"),
    OTHER("другой");
}

fun getSex(description: String): Sex {
    return when (description) {
        Sex.MAN.description -> Sex.MAN
        Sex.WOMEN.description -> Sex.WOMEN
        else -> Sex.OTHER
    }
}

const val INSTRUCTIONS_MESSAGE = """Введите имя и пол человек.
    |Вводите пол в следующем формате: "мужчина" - если это мужчина, и "женщина" - если это женщина.
    |После ввода 5 человек, вам будет выдан список который вы внесли.
"""
const val INPUT_N = "Введите имя:"
const val INPUT_S = "Введите пол:"