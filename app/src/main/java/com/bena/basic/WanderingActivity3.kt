package com.bena.basic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class WanderingActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wander3()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Wander3() {
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
                LazyRow {
                    item() {
                        Row {
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
                                Image(
                                    painter = painterResource(id = R.drawable.ai),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(500.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.ari),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(500.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.fgh),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(500.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.bnm),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(500.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.qaqa),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(500.dp)
                                )
                                }
                            }
                        Text("Forest Haven Estate - Mordern Villa (near mountain)")
                        Column {
                            val rating =  LocalContext.current
                            Button(
                                onClick = {rating.startActivity(Intent(rating, WanderingActivity1::class.java))},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color.Green),
                                border = BorderStroke(1.5.dp, Color.LightGray),
                                contentPadding = PaddingValues(15.dp),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(120.dp)
                            ){
                                Image(imageVector = Icons.Default.Star, contentDescription = "")

                                Text("4.5 Rating", color = Color.Black)
                            }
                        }
                    }
                }
            }
        }
    }
}