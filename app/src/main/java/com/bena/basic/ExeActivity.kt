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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
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

class ExeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exe()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Exe(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Box(modifier = Modifier
                .fillMaxSize(),
            ){
                Image(painter = painterResource
                    (id = R.drawable.bnm),
                    contentDescription = "Impala Shop",
                    modifier = Modifier
                        .fillMaxSize()
//                .clip(CircleShape)
                    ,
                    contentScale = ContentScale.Fit
                )

            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Cyan)
                ) {
                    Image(imageVector = Icons.Default.Home, contentDescription = "")
                    Text ("IMPALA SHOPPING MALL ")
                    Image(imageVector = Icons.Default.Menu, contentDescription = "")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    val hotel = LocalContext.current
                    Button(
                        onClick = {hotel.startActivity(Intent(hotel, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        contentPadding = PaddingValues(15.dp),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")

                        Text("Hotels", color = Color.Black)
                    }



                    val holiday = LocalContext.current
                    Button(
                        onClick = {holiday.startActivity(Intent(holiday, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        contentPadding = PaddingValues(15.dp),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)

                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Holiday", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    val taxi = LocalContext.current
                    Button(
                        onClick = {taxi.startActivity(Intent(taxi, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Taxi", color = Color.Black)
                    }



                    val ticket = LocalContext.current
                    Button(
                        onClick = {ticket.startActivity(Intent(ticket, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Ticket", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    val airplane = LocalContext.current
                    Button(
                        onClick = {airplane.startActivity(Intent(airplane, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Airplane", color = Color.Black)
                    }



                    val harbour = LocalContext.current
                    Button(
                        onClick = {harbour.startActivity(Intent(harbour, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Harbour", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(text = "Popular in Town", textAlign = TextAlign.Justify)

                    Text(text = "View all", color = Color.Blue, textAlign = TextAlign.End)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row() {

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)


                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Nusa Penida"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Nusa Penida")
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Tanah Lot"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Tanah Lot")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row() {

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)


                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Nusa Penida"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Nusa Penida")
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Tanah Lot"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Tanah Lot")
                        }
                    }
                }
            }
            }
        }
    }
}