package Lesson_3.tasks

fun main() {

    /**
     * отправляем на сервер в виде строки формата:
     * -- [откуда-куда: номер хода]
     * !Все данные (откуда куда номер хода) инции и хронить во тдельных переменных
     *
     * нужно сборать единую строку из объявнеллных переменных и сохоранить в новую переменную
     *
     * далее этим переменным нужно присвоить новые данные и вывести в консоль след ход белых
     * опердлить каккое значение будет в переменной "Куда" для фигуры, стоящзей на D2 и
     * продвинушейвся на 1 клетку вперед
     *
     */

    var from: String = "E2"
    var where: String = "E4"
    var numberOfMove: Int = 1

    var stringForServer = "[$from:$where; $numberOfMove]"
    println(stringForServer)
    from = "D2"
    where = "D4"
    numberOfMove = 2
    stringForServer = "[$from:$where; $numberOfMove]"
    println(stringForServer)

}