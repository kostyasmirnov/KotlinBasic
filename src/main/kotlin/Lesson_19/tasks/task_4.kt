package Lesson_19.tasks

fun main() {

    val abrams = Tank()

    abrams.setNewAmmunitionType(Ammunition.BLUE)
    abrams.takeShot(Ammunition.BLUE)
    abrams.setNewAmmunitionType(Ammunition.RED)
    abrams.takeShot(Ammunition.RED)

}

enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank {

    private fun perfromAction(ammunition: Ammunition) {
        when (ammunition) {
            Ammunition.BLUE -> println("Нанесено ${ammunition.damage} урона")
            Ammunition.GREEN -> println("Нанесено ${ammunition.damage} урона")
            Ammunition.RED -> println("Нанесено ${ammunition.damage} урона")
            else -> println("Заклинило орудие")
        }
    }

    fun takeShot(ammunition: Ammunition) {
        return perfromAction(ammunition)
    }

    fun setNewAmmunitionType(ammunition: Ammunition) {
        println("На танк установлен тип боеприпасов: ${ammunition.name}")
    }

}