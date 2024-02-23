package pl.maniak.jetpackcomposebootcamp.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
sealed class MainUiState: Parcelable {

    @Parcelize
    object Loading: MainUiState()

    @Parcelize
    data class Error(val message: String): MainUiState()

    @Parcelize
    data class Success(val model: List<String>): MainUiState()
}