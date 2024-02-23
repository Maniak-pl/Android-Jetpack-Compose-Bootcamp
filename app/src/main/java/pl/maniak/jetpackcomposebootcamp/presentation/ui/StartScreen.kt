package pl.maniak.jetpackcomposebootcamp.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartScreen(
    model: List<String>,
    onProjectClicked: (String) -> Unit
) {
    Column(modifier = Modifier.padding(14.dp)) {
        Text(
            text = "Android Jetpack Compose:\nThe Comprehensive Bootcamp",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        model.forEach { name ->
            Project(name = name, onProjectClicked = onProjectClicked)
        }
    }
}

@Composable
fun Project(
    modifier: Modifier = Modifier,
    name: String,
    onProjectClicked: (String) -> Unit
) {
    val linkTextStyle = TextStyle(
        color = Color.Blue,
        fontSize = 14.sp,
        fontStyle = FontStyle.Italic,
        textDecoration = TextDecoration.Underline
    )
    Text(
        modifier = modifier
            .padding(6.dp).clickable {
                onProjectClicked(name)
            },
        text = "Project: $name",
        style = linkTextStyle
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StartScreenPreview() {
    StartScreen(
        model = listOf("Compose", "Kotlin", "Android", "Jetpack"),
        onProjectClicked = {}
    )
}