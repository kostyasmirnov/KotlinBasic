package Lesson_9

fun main() {

    // List - обращение по index, могут встречатся дубликаты
    // Set - Множество, коллекция уникальныъ элементов
    // Map - словарь или асиативный список, определенный набор ключ-значение. Ключ уникальный

    // фикс размер у массива
    // Array<T>, List<T>
    // Массивиы отпмизированы для примитивов, списки нет
    // отличается процесс сравнения элементов

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3) // лист с возможностью добавление и удаление элементов

    val mutableList = mutableListOf(11, 15, 20, 12, 9 , 14)


    mutableList.add(42)

    mutableList.add(0, 42)
//    println(mutableList)
//
//    println(mutableList.contains(42))
//    println(mutableList.isEmpty())
//    println(mutableList.isNotEmpty())
//    println(mutableList.lastIndexOf(42))

    mutableList.sort()
    mutableList.sortDescending()
    mutableList.reverse()
    //println(mutableList)
    mutableList.forEach { number ->
        //println(number)
    }

    // интервал - for
    // коллекция - forEach
    // break, continue - for


    val mutableList2 = mutableList.filter {
        it == 42
    }
    //mutableList2.forEach { println(it) }

    val mutableList3 = mutableList2.map {
        it * 2
    }

    mutableList3.forEach { println(it) }

}