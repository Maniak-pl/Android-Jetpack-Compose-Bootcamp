package pl.maniak.jetpackcomposebootcamp.presentation.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pl.maniak.jetpackcomposebootcamp.presentation.model.MainUiState

@Composable
fun MainScreen(
    uiState: MainUiState,
    onProjectClicked: (String) -> Unit
) {
    when (uiState) {
        is MainUiState.Loading -> {
            DefaultProgressScreen()
        }

        is MainUiState.Success -> {
            StartScreen(
                model = uiState.model,
                onProjectClicked = onProjectClicked
            )
        }

        is MainUiState.Error -> {
            Text(text = "Error: ${uiState.message}")
        }

        is MainUiState.ProjectBizCard -> BizCardScreen()
    }
}

