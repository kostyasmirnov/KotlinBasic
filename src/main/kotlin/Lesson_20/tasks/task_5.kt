package Lesson_20.tasks

import kotlin.random.Random

fun main() {

    val robot = Robot()
    robot.setModifier { phrase -> phrase.split(" ").reversed().joinToString(" ") }
    robot.say()

}

class Robot {

    private var modifier: ((String) -> String)? = null

    fun say() {
        val phrases = listOf(PHRASE1, PHRASE2, PHRASE3, PHRASE4, PHRASE5)
        val randomIndex = Random.nextInt(phrases.size)
        val phrase = phrases[randomIndex]
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }


}

const val PHRASE1 = "Привет, как дела?"
const val PHRASE2 = "Какой сегодня хороший день!"
const val PHRASE3 = "Я очень хочу пойти погулять"
const val PHRASE4 = "Почему сегодня так жарко?"
const val PHRASE5 = "Сработал будильник на 8 утра, просыпайтесь!"
