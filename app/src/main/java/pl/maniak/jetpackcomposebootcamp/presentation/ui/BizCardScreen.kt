package pl.maniak.jetpackcomposebootcamp.presentation.ui

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BizCardScreen() {
    CreateBizCard()
}

@Composable
fun CreateBizCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BizCardScreenPreview() {
    BizCardScreen()
}