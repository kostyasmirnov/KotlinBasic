package Lesson_12

import Lesson_11.Dish

class Ingredient(val name: String, val weight: Int, val count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        this.isNeedToPrepare = isNeedToPrepare

    }

    init {
        println("Ингрилент $name создан")
    }

    //вторичный
    //первчный
    // блок init
    // тело вторичного конструктора

}