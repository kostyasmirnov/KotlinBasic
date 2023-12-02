package Lesson_13

fun main() {

    // NullPointerException (NPE)
    // null - отсуствие объекта


    val nullableString: String? = null
    val nonNullableString: String = "some string"

//    println(nullableString?.length)
//    println(nonNullableString.length)
//
//    val nullableLine: String = readln()

//    val stringLength: Int = nullableString?.length ?: 99
//    println(stringLength)

    val stringLength: Int = nullableString!!.length
}