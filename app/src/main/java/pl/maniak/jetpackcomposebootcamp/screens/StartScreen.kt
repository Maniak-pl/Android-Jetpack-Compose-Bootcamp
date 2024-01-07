package pl.maniak.jetpackcomposebootcamp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.maniak.jetpackcomposebootcamp.ui.theme.JetpackComposeBootcampTheme

@Composable
fun StartScreen() {
    Column(modifier = Modifier.padding(14.dp)) {
        Text(
            text = "Android Jetpack Compose:\nThe Comprehensive Bootcamp",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Project(name = "1. BizCard App")
        Project(name = "2. Kotlin Code")
        Project(name = "3. Make it Rain")
        Project(name = "4. JetTip App")
        Project(name = "5. Movie App")
        Project(name = "6. JetNote App")
        Project(name = "7. JetTrivia App")
        Project(name = "8. Weather Forecast App")
        Project(name = "9. AReader Capstone Project")
    }
}

@Composable
fun Project(name: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.padding(6.dp),
        text = "Project: $name",
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivityPreview() {
    JetpackComposeBootcampTheme {
        StartScreen()
    }
}