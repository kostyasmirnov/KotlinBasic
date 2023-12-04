package Lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        println("$name: сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("${name}: запущена дагностика дронов и майнеров")
    }

}