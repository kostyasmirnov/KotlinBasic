package Lesson_11

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "someName",
        category = "cats",
        ingredients = listOf("first", "second", ":3", ";4")
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "2name",
        category = "eats",
        ingredients = listOf("2131", "afafa", "awga", "gasgasg")
    )

    //println(dish1.name)

//    dish1.category = "блюда из яиц"
//    dish2.inFavorites = true
//    println(dish1.inFavorites)


    println("do it")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("do it for 2")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)


}