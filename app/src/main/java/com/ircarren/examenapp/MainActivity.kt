package com.ircarren.examenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ircarren.examenapp.model.Dios
import com.ircarren.examenapp.provider.DiosProvider
import com.ircarren.examenapp.provider.IconProvider
import com.ircarren.examenapp.ui.theme.ExamenAppTheme
import java.util.Locale.Category

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SootheNavBar()
                }
            }
        }
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier){
    // funcion que crea la barra de busqueda
    Row(modifier = modifier.padding(8.dp)) {
        TextField(
            value = "",
            onValueChange = {

            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            placeholder = {
                Text(text = "Buscar")
                          },
            modifier = Modifier
                .heightIn(min = 56.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun BottomNavigation(modifier: Modifier= Modifier){

    var selectedTab by remember { mutableStateOf(0) }
    val items_icons = IconProvider.icons

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ){
        NavigationBar {
            items_icons.forEachIndexed { index, icono ->
                NavigationBarItem(
                    selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    icon = { Icon(imageVector = icono.icon, contentDescription = icono.title) },
                    label = { Text(text = icono.title) }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SootheNavBar(){

    ExamenAppTheme {
        Scaffold(bottomBar = {BottomNavigation()}
        ){
            padding ->  HomeScreen(Modifier.padding(padding) )
        }
    }
}



@Composable
fun HomeScreen(padding:Modifier){
    Surface(color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            SearchBar()
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun CategoriesList(modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        Text(
            text = "lista de dioses Griegos".uppercase(),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )
        LazyColumn(modifier = Modifier.padding(8.dp)){
            items(DiosProvider.dioses.size){
                
            }
        }
    }
}
@Composable
fun DiosItem(modifier: Modifier = Modifier, dios: Dios){
    Column(modifier = modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        
    }
}