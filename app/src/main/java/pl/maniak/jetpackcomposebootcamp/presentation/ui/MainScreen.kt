package pl.maniak.jetpackcomposebootcamp.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.maniak.jetpackcomposebootcamp.presentation.model.MainUiState

@Composable
fun MainScreen(uiState: MainUiState) {
    when (uiState) {
        is MainUiState.Loading -> {
            DefaultProgressScreen()
        }

        is MainUiState.Success -> {
            MainScreen(model = uiState.model)
        }

        is MainUiState.Error -> {
            Text(text = "Error")
        }
    }
}

@Composable
fun MainScreen(model: List<String>) {
    Column(modifier = Modifier.padding(14.dp)) {
        Text(
            text = "Android Jetpack Compose:\nThe Comprehensive Bootcamp",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        model.forEach { name ->
            Project(name = name)
        }
    }
}

@Composable
fun Project(
    name: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.padding(6.dp),
        text = "Project: $name",
    )
}