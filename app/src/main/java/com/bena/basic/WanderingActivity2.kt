package com.bena.basic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class WanderingActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wander2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Wander2() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        item {
           Box(
                modifier = Modifier
                    .fillMaxSize(),
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                ) {

                    val search = LocalContext.current
                    Button(
                        onClick = {search.startActivity(Intent(search, WanderingActivity2::class.java))},
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray)
                    ){
                        Image(imageVector = Icons.Default.Search, contentDescription = "")
                        Text("Looking for something.....", color = Color.LightGray)
                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .background(color = Color.Transparent)
                            .fillMaxWidth()
                    ){
                        val hotel = LocalContext.current
                        Button(
                            onClick = {hotel.startActivity(Intent(hotel, WanderingActivity1::class.java))},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                            border = BorderStroke(1.5.dp, Color.LightGray),
                            contentPadding = PaddingValues(15.dp),
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                        ){
                                    Image(imageVector = Icons.Default.Home, contentDescription = "")
                                    Text("Hotel", color = Color.Black)
                        }

                        val rental = LocalContext.current
                        Button(
                            onClick = {rental.startActivity(Intent(rental, WanderingActivity1::class.java))},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.Green),
                            border = BorderStroke(1.5.dp, Color.LightGray),
                            contentPadding = PaddingValues(15.dp),
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                        ){
                            Image(imageVector = Icons.Default.Home, contentDescription = "")

                            Text("Rentals", color = Color.Black)
                        }

                        val restaurant = LocalContext.current
                        Button(
                            onClick = {restaurant.startActivity(Intent(restaurant, WanderingActivity1::class.java))},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                            border = BorderStroke(1.5.dp, Color.LightGray),
                            contentPadding = PaddingValues(15.dp),
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                        ){
                            Image(imageVector = Icons.Default.Home, contentDescription = "")

                            Text("Restaurant", color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Column {
                        Card(
                            elevation = CardDefaults.cardElevation(200.dp),
                            border = BorderStroke(1.5.dp, color = Color.Transparent),
                            modifier = Modifier
                                .size(400.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.wandering),
                                contentDescription = "Nusa Penida",
                                modifier = Modifier
                                    .size(500.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .padding(0.dp)
                            ) {
                                Text(text = "Forest Haven Estate - Modern Villa", textAlign = TextAlign.Justify)
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))


                        Card(
                            elevation = CardDefaults.cardElevation(200.dp),
                            border = BorderStroke(1.5.dp, color = Color.Transparent),
                            modifier = Modifier
                                .size(400.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.qaqa),
                                contentDescription = "Nusa Penida",
                                modifier = Modifier
                                    .size(500.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .padding(0.dp)
                            ) {
                                Text(text = "Forest Haven Estate - Modern Villa", textAlign = TextAlign.Justify)
                            }
                        }
                    }
                }
            }
        }
    }
}