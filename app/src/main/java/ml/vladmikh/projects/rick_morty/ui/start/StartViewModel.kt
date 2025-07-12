package ml.vladmikh.projects.rick_morty.ui.start

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class StartViewModel @Inject constructor(

) : ViewModel() {

    private val _uiState = MutableStateFlow<StartUIState>(StartUIState.Initial)
    val uiState: StateFlow<StartUIState> = _uiState
}