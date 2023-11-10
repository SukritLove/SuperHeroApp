package com.example.practicesuperheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicesuperheroesapp.ui.theme.PracticeSuperheroesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeSuperheroesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperHeroList()
                }
            }
        }
    }
}

@Composable
fun SuperHeroList(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        HeroCard()
    }
}

@Composable
fun HeroCard() {
    Card {
        Box(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding))
                .height(dimensionResource(R.dimen.image_size))
        ) {
            Row() {

                Column {
                    Text(
                        text = stringResource(id = R.string.hero1),
                        style = MaterialTheme.typography.displaySmall,
                    )
                    Text(
                        text = stringResource(id = R.string.description1),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.android_superhero1),
                    contentDescription = null,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding))
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeSuperheroesAppTheme {
        HeroCard()
    }
}