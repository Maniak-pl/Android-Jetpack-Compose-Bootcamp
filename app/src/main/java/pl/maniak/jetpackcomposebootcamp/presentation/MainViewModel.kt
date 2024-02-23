package pl.maniak.jetpackcomposebootcamp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import pl.maniak.jetpackcomposebootcamp.presentation.model.MainUiState

class MainViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MainUiState>(MainUiState.Loading)
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.emit(MainUiState.Loading)
            delay(1000)
            _uiState.emit(
                MainUiState.Success(
                    listOf(
                        "1. BizCard App",
                        "2. Kotlin Code",
                        "3. Make it Rain",
                        "4. JetTip App",
                        "5. Movie App",
                        "6. JetNote App",
                        "7. JetTrivia App",
                        "8. Weather Forecast App",
                        "9. AReader Capstone Project"
                    )
                )
            )
        }
    }
}