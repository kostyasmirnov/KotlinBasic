package Lesson_10.tasks


fun main() {

    val passwordLengthFromUser = readln().toInt()!!
    println("Сгенерированный пароль: ${generatePassword(passwordLengthFromUser)}")

}

fun generatePassword(length: Int): String {
    var password = ""
    for (i in 0 until length) {
        val specialChars = "!\"#\$%&'()*+,-./ ".random()
        val numbers = ('0'..'9').random()
        password += if (password.length < length && i % 2 == 0) {
            specialChars
        } else {
            numbers
        }
    }
    return password
}