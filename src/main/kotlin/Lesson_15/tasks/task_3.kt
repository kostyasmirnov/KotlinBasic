package Lesson_15.tasks

fun main() {

    val regularUser = RegularUser("testik19")
    val adminUser = AdministratorUser("alkor")

    regularUser.readForum()
    regularUser.writeMessage("дота для задротов")

    adminUser.readForum()
    adminUser.deleteMessage(regularUser.userId)
    adminUser.writeMessage("Не трогай дотеров @${regularUser.username}")
    adminUser.deleteUser(regularUser.userId)

}

abstract class ForumUser(
    val username: String,
    val role: String,
    val userId: Int,
) {

    abstract fun writeMessage(message: String)

    abstract fun readForum()

}

class RegularUser(username: String) : ForumUser(username, role = "RegularUser", 1) {


    override fun writeMessage(message: String) {
        println("$username написал сообщение: $message")
    }

    override fun readForum() {
        println("$username читает форум")
    }

}

class AdministratorUser(username: String) : ForumUser(username, role = "Admin", 2) {


    fun deleteMessage(userId: Int) {
        println("$username удалил сообещение пользователя $userId")
    }

    fun deleteUser(userId: Int) {
        println("$username удалил пользователя $userId")
    }

    override fun writeMessage(message: String) {
        println("$username написал сообщение: $message")
    }

    override fun readForum() {
        println("$username читает форум")
    }
}