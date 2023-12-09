package Lesson_14.tasks


fun main() {

    val chat = Chat()
    chat.addMessage("Всем привет!", "Алиса")
    chat.addMessage("Привет Алиса!", "Коля")
    chat.addThreadMessage("Как дела?", "Лена", 1)
    chat.addThreadMessage("Хорошо, просто отдыхаю", "Давид", 3)
    chat.addThreadMessage("Аналогично", "Ева", 3)
    chat.printChat()

}

open class Message(
    val id: Int,
    val text: String,
    val author: String,
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
) : Message(id, text, author)

class Chat {

    private val messages = mutableListOf<Message>()
    fun addMessage(text: String, author: String) {
        val id = messages.size + 1
        val message = Message(id, text, author)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val id = messages.size + 1
        val message = ChildMessage(id, text, author, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }
        for (message in groupedMessages.keys.sorted()) {
            val indent = if (groupedMessages[message]!!.first() is ChildMessage) "\t" else ""
            for (msg in groupedMessages[message]!!) {
                println("$indent${msg.author}: ${msg.text}")
            }
        }
    }

}