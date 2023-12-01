package Lesson_11.tasks.task5


fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Алексей", 1)
    val user2 = forum.createNewUser("Костя", 2)

    forum.createNewMessage(user1.userId, "System.out.println()")
    forum.createNewMessage(user2.userId, "beast master")

    forum.printThread()

}

class Forum {

    var id = 1
    var users = mutableListOf<User>()
    val messages = mutableListOf<Message>()

    fun generateId(): Int {
        return id++
    }

    fun createNewUser(userName: String, userId: Int): User {
        val user = User(generateId(), userName)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String) {
        val author = users.find { it.userId == authorId }
        if (author != null) {
            val newMessage = Message(author, message)
            messages.add(newMessage)
        } else println("Не нашли такого пользователя")
    }


    fun printThread() {
        messages.forEach { message -> message.printMessage() }
    }
}

class User(
    var userId: Int = 1,
    val userName: String,
)

class Message(
    private val author: User,
    private val message: String,
) {
    fun printMessage() {
        println("${author.userName}: $message")
    }
}
