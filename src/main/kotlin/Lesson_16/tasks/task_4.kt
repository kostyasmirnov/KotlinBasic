package Lesson_16.tasks

fun main() {

    val order1 = Order(1, "В обрабтке")
    println(order1.getStatus())
    order1.changeStatus("передан курьеру")
    println(order1.getStatus())

}

class Order(
    private val orderNumber: Int,
    private var status: String,
) {

    fun changeStatus(newStatus: String) {
        updateStatus(newStatus)
    }

    fun getStatus(): String {
        return status
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }
}