package Lesson_11.tasks

fun main() {

    val user1 = User3(nickname = "Satoru Gojo", status = "микрофон выключен")
    val user2 = User3(nickname = "Makima", status = "разговаривает")
    val user3 = User3("photo.png", nickname = "Grimstroke", status = "пользователь заглушен")

    val room1 = Room(name = "Комната демонов", members = mutableListOf(user1, user2, user3))
    room1.showCoverName()
    room1.startGroupCall()
    room1.scrollUp()
    room1.scrollDown()
    user1.getStatus()
    user2.getStatus()
    room1.showUsers()
    room1.endGroupCall()

    println()

    val room2 = Room(cover = "xdxd.png", name = "Work area room", members = mutableListOf(user2, user3))
    room2.showUsers()
    room2.addUser(user1)
    room2.showUsers()
    room2.showCover()
    user3.avatarLongTap()
    room2.muteMic()
    room2.unmuteMic()

}

class Room(
    val cover: String = "default_cover.png",
    val name: String,
    val members: MutableList<User3>,
) {

    fun showCoverName() {
        println("Название группы $name")
    }

    fun scrollDown() {
        println("Скролим ленту вниз")
    }

    fun scrollUp() {
        println("Скролим ленту вверх")
    }

    fun startGroupCall() {
        println("Начинаем групповой звонок")
    }

    fun endGroupCall() {
        println("Заканчиваем групповой звонок")
    }

    fun muteMic() {
        println("Отключаем микрофон")
    }

    fun unmuteMic() {
        println("Включаем микрофон")
    }

    fun showUsers() {
        members.forEach {
            println(members[members.indexOf(it)].nickname)
        }
    }

    fun addUser(user: User3) {
        members.add(user)
    }

    fun showCover() {
        println("Иконка группы $cover")
    }

}

class User3(
    val avatar: String = "avatar.png",
    val nickname: String,
    val status: String,
) {

    fun avatarLongTap() {
        println("Делае лонг тап по аватару")
        lightLongTapNickname()
    }

    fun lightLongTapNickname() {
        println("Подсвечиваем никнейм $nickname")
    }

    fun getStatus() {
        if (status.lowercase() == "разговаривает") println("$STATUS_USER разговаривает")
        else if (status.lowercase() == "микрофон выключен") println("$STATUS_USER микрофон выключен")
        else if (status.lowercase() == "пользователь заглушен") println("$STATUS_USER пользователь заглушен")
        else println(STATUS_IS_NULL)
    }
}

const val STATUS_USER = "Статус пользователя:"
const val STATUS_IS_NULL = "Пользователь не установил статус"