package Lesson_11.task_2

fun main() {

    var userTestik = user2(
        id = 1,
        login = "testik",
        password = "qwerty123",
        email = "testikWork@gmail.com",
        bio = "empty",
    )

    println("Расскажите о себе: ")

    userTestik.addBio()

    userTestik.changePassword()

    userTestik.printInfoAboutUser(
        id = userTestik.id, login = userTestik.login,
        password = userTestik.password, email = userTestik.email, bio = userTestik.bio
    )

}

class user2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {


    fun printInfoAboutUser(id: Int, login: String, password: String, email: String, bio: String) {
        println("Информация о пользователе №$id\n$login\n$password\n$email\n$bio")
    }

    fun addBio(){
        bio = readln()
    }

    fun changePassword() {
        println("Введиет старый пароль: ")
        val currentPassword = readln().toString()!!
            if (password == currentPassword) {
                println("Введите новый пароль")
                password = readln().toString()
                println("Пароль изменен")
            } else {
                println("Введен неверный пароль. Попробуйте еще раз: ")
            }
    }
}