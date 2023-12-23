package Lesson_22.tasks


fun main() {

    val viewModel = MainScreenViewModel()
    viewModel.loadData()

}

data class MainScreenState(
    val data: String?,
    val isLoading: Boolean,
)

class MainScreenViewModel {

    private var mainScreenState = MainScreenState(data = null, isLoading = false)

    private fun displayState() {
        println("Дата: ${mainScreenState.data}, Загружен: ${mainScreenState.isLoading}")
    }

    private fun updateState(data: String?, isLoading: Boolean) {
        mainScreenState = mainScreenState.copy(isLoading = isLoading, data = data)
        displayState()
    }

    fun loadData() {

        updateState(isLoading = true, data = null)
        Thread.sleep(1000) // симуляция получения данных с сервера
        updateState(isLoading = false, data = "Загруженные данные")

    }
}

