package Lesson_3

fun main() {
    // конкатенция строк

    val greetings = "Здравствуйте"
    val userName = "lord"

  //  println(greetings + ", " + userName + "!" + space + "Какой" + space + "будет ваш главный вопрос?")

    // интерполяция строок

//    println("$greetings, $userName! Какой будет ваш главный вопрос?")
//    println("На который можно ответить ${40 + 2}")

    //многострочная запись

    val multiString= """
                 |строка1
           |строка2
               |строка3
    """.trimMargin()
    println(multiString)

}