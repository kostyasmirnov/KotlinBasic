package Lesson_18

import java.util.Date

fun main() {

    // ad hoc (по случаю)
    // subtyping (полиморфизм включения)
    // parametric (параметрический)

    val creationDate = Date()
    val note = NotesAppItem()


    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "message",
        8800545453,
    )

    println()

    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    println()

    val listItem: NotesAppItem = ListItem(
        "todoList",
        creationDate,
        "message",
        listOf("wash dog", "todo")
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, listItem, phoneItem)

    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach { println(it.getItemData()) }
}