package ml.vladmikh.projects.rick_morty.ui.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import ml.vladmikh.projects.rick_morty.R


@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    viewModel: StartViewModel = viewModel()
) {
    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    /*if (uiState is StartUIState.Loaded) {

        val cards = uiState.characters
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(characters) { item ->
                CharacterItem(item)
            }
        }
    }*/

}


@Composable
fun CharacterItem(//character: SerialCharacter
) {
    Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box {
                AsyncImage(modifier = Modifier.fillMaxWidth(),
                    model = "https://example.com/image.jpg",
                    contentDescription = "Translated description of what the image contains"
                )

                Row(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .background(color = MaterialTheme.colorScheme.secondary,
                            shape = RoundedCornerShape(topStart = 16.dp)
                        )
                        .padding(horizontal = 16.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Surface (modifier = Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        ,color = Color.Green
                        ) {}

                    Text(
                        text = "Hello!",
                        color = Color.White)

                }

            }


            Text(text = "Hello",
                color = Color.White)

            Row(modifier = Modifier.padding(4.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp)) {

                Text(text = "Hello",
                    color = Color.White)

                VerticalDivider(color = Color.White)

                Text(text = "Hello",
                    color = Color.White)
            }

        }

    }

}

@Preview
@Composable
private fun СharacterItemPreview() {
    CharacterItem()
}