package pl.maniak.jetpackcomposebootcamp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import pl.maniak.jetpackcomposebootcamp.presentation.model.MainUiState
import pl.maniak.jetpackcomposebootcamp.presentation.ui.MainScreen
import pl.maniak.jetpackcomposebootcamp.presentation.ui.theme.JetpackComposeBootcampTheme

internal class MainActivity : ComponentActivity() {

    private val viewModel = MainViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeBootcampTheme {
                val uiState = viewModel.uiState.collectAsStateWithLifecycle().value
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(
                        uiState = uiState,
                        onProjectClicked = viewModel::onProjectClicked
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivityPreview() {
    JetpackComposeBootcampTheme {
        MainScreen(uiState = MainUiState.Loading, onProjectClicked = {})
    }
}
