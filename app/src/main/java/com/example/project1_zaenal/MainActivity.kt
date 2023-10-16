package com.example.project1_zaenal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project1_zaenal.ui.theme.Project1_ZaenalTheme
import com.example.project1_zaenal.data.datasource
import com.example.project1_zaenal.biodata.project1_zaenal





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project1_ZaenalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    project1_zaenalApp()
                }
            }
        }
    }
}

@Composable
fun project1_zaenalApp() {
    project1_zaenalList(
        project1_zaenalList = datasource().loadproject1_zaenal(),
    )
}

@Composable
fun project1_zaenalList(project1_zaenalList: List<project1_zaenal>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(project1_zaenalList) { project1_zaenal ->
            project1_zaenalCard(
                project1_zaenal = project1_zaenal,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun project1_zaenalCard(project1_zaenal: project1_zaenal, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(project1_zaenal.imageResourceId),
                contentDescription = stringResource(project1_zaenal.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(project1_zaenal.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
private fun project1_zaenalCardPreview() {
    project1_zaenalCard(project1_zaenal(R.string.Project1_Zaenal1, R.drawable.image1))
}
