package Lesson_15.tasks


fun main() {

    val temperature1: Temperature = Temperature(25)
    val precipitationAmount1: PrecipitationAmount = PrecipitationAmount(37.48)
    val weatherServer1 = WeatherServer()

    weatherServer1.sendWeatherData(temperature1)
    weatherServer1.sendWeatherData(precipitationAmount1)
}

abstract class WeatherStationStats

class Temperature(
    val valueTemperatue: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val valuePrecipitation: Double,
) : WeatherStationStats()

class WeatherServer {

    fun sendWeatherData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> {
                println("$SEND_MESSAGE температуре: ${data.valueTemperatue}°C")
            }

            is PrecipitationAmount -> {
                println("$SEND_MESSAGE вероятности осадков: ${data.valuePrecipitation} mm")
            }
            else -> {
                println("Пришли данные которые не относятся ни к температуре, ни к осадкам")
            }
        }
    }

}

const val SEND_MESSAGE = "Отправили данные по"