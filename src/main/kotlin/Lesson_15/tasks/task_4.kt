package Lesson_15.tasks

fun main() {

    val guitar: MusicalInstruments = MusicalInstruments("гитара", 1, 40, 10000)
    val drums: MusicalInstruments = MusicalInstruments("барабаны", 2, 10, 7000)
    val piano: MusicalInstruments = MusicalInstruments("фортепиано", 3, 20, 15000)

    val pianoKeys: ComponentsInstruments = ComponentsInstruments("клавыши для фортепиано", 1, 400, 500)
    val mallets: ComponentsInstruments = ComponentsInstruments("колотушки", 2, 38, 1000)
    val strings: ComponentsInstruments = ComponentsInstruments("струны", 3, 9000, 100)

    guitar.searchMusicalInstruments()
    drums.searchMusicalInstruments()
}

abstract class Shop(
    val name: String,
    val id: Int,
    val countUnitsOnWarehouse: Int,
    val price: Int,
)

class MusicalInstruments(
    name: String,
    id: Int,
    countUnitsOnWarehouse: Int,
    price: Int,
) : Shop(name, id, countUnitsOnWarehouse, price), SearchMusicalInstruments {

    override fun searchMusicalInstruments() {
        super.searchMusicalInstruments()
        Thread.sleep(2000)
        println("На складе еще есть $countUnitsOnWarehouse едениц товара \"$name\"")
    }
}

class ComponentsInstruments(
    name: String,
    id: Int,
    countUnitsOnWarehouse: Int,
    price: Int,
) : Shop(name, id, countUnitsOnWarehouse, price)

interface SearchMusicalInstruments {

    fun searchMusicalInstruments() {
        println("Выполняется поиск...")
    }
}