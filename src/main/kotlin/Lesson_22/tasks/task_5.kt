package Lesson_22.tasks

import java.util.Date

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Земле звездная система",
        dateTime = Date(),
        distanceFromEarthLightYears = 4.37,
    )

    val (name, description, dateTime, distanceFromEarthLightYears) = alphaCentauri

    println("Имя: $name\nОписание: $description\nДата и время: $dateTime\nРасстояние от Земли в световых годах: $distanceFromEarthLightYears")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: Date,
    val distanceFromEarthLightYears: Double,
)