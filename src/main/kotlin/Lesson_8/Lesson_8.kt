package Lesson_8

fun main() {

    val ingredient1 = "яйцо"
    val ingredient2 = "помидор"
    val ingredient3 = "зелень"
    val ingredient4 = "соль"
    val ingredient5 = "перец"

    val arrayOfIngredients:Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

    //val intArray2 = arrayOf() массив с arrayOf() нельзя создать не проинициализированным
    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3 ,4 ,5)

//    println("Размер массива с ингридентами: ${arrayOfIngredients.size}")
//    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[8]) //exception

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

//    arrayOfIngredients.set(1, "капуста")
//    arrayOfIngredients.get(1)
//    println(arrayOfIngredients[1])

    for (i in arrayOfIngredients) {
        println("Ингридент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}