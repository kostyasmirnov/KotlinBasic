package Lesson_10.tasks


fun main() {

    println("Введите длину пароля: ")
    val passwordLengthFromUser = readln().toInt()!!
    println("Сгенерированный пароль: ${generatePassword(passwordLengthFromUser)}")

}

fun generatePassword(length: Int): String {
    var password = ""
    val specialChars = ('!'..'/')
    val numbers = ('0'..'9')

    for (i in 0 until length) {
        password += if (i % 2 == 0) {
            specialChars.random()
        } else {
            numbers.random()
        }
    }
    return password
}