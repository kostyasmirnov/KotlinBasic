package Lesson_16

fun main() {

    // public - по умолчанию для всех
    // private - доступны только в рамках файла или в рамках в классе
    // protected - видны в классе, в котормо определены, и в классах наследниках
    // internal - доступны в любой части модуля в которых они определены

    val guide = HitchhikerGuide()
//    guide.title = "Don't panic"
//    guide.chooseArcticle()

//    Support().printInfo()
    println(guide.getNumberOfPages())
    guide.setNumberOfPages(42000)
    println(guide.getNumberOfPages())
}