package Lesson_19

fun main() {

    // дни недели
    // цвета
    // статусы

    val statusesFromServer = listOf(101, 102, 103)

    for (i in statusesFromServer) {
        when (i) {
            Status.NEW.id -> TODO("call setStatus()")
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }

    println()
//    println(Status.NEW.name)
//    println(Status.NEW.ordinal)
//    for (i in Status.values()) println(i)

    println(Status.NEW.getStatusDescription())
    println(Status.COOKING.getStatusDescription())
    println(Status.COMPLETED.getStatusDescription())
}

enum class Status(val id: Int?) {
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Заказ создан"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Заказ оплачен и начал готовится"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Заказ готов, можно забрать"
        }
    },
    ERROR(null) {
        override fun getStatusDescription(): String {
            return "Что-то пошло не так"
        }
    };

    abstract fun getStatusDescription(): String
}

fun setStatus(status: Status) {
    when (status) {
        Status.NEW -> println("Заказ принят")
        Status.COOKING -> println("Заказ готовят")
        Status.COMPLETED -> println("Заказ выполнен")
        Status.ERROR -> println("Статус неизвестен")
    }
}