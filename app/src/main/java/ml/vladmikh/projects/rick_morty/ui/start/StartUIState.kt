package ml.vladmikh.projects.rick_morty.ui.start

import ml.vladmikh.projects.rick_morty.utils.ErrorLoading

sealed interface StartUIState {

    object Initial: StartUIState
    object Loading : StartUIState
    //data class Loaded(val character: List<SerialCharacter>) : StartUIState
    data class Error(val error: ErrorLoading) : StartUIState
}