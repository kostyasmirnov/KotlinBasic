package Lesson_16.tasks

fun main() {

    val order1 = Order(1, "В обрабтке")
    println(order1.status)
    order1.changeStatus("передан курьеру")
    println(order1.status)

}

class Order(
    private val orderNumber: Int,
    var status: String,
) {

    fun changeStatus(newStatus: String) {
        updateStatus(newStatus)
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }
}