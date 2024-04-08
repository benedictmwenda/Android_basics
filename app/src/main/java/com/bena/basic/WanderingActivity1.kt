package com.bena.basic

import android.content.Intent
import android.graphics.fonts.Font
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

class WanderingActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wander()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Wander() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
              Image(
                    painter = painterResource
                        (id = R.drawable.bnm),
                    contentDescription = "Impala Shop",
                    modifier = Modifier
                        .fillMaxSize()
//                .clip(CircleShape)
                    ,
                    contentScale = ContentScale.Crop
                )

                Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                ) {
                    Text(text = "QAQA SOFTWARES",color = Color.White, textAlign = TextAlign.Justify)
                    Text("Your Unlimited Compliment for Web development & Android Development",color = Color.White, textAlign = TextAlign.Center)

                    Row {
                        val wan2 = LocalContext.current
                        Button(
                            onClick = {wan2.startActivity(Intent(wan2, WanderingActivity2::class.java))},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.White),
                            border = BorderStroke(1.5.dp, Color.Transparent)
                        ){
                            Image(imageVector = Icons.Default.Face, contentDescription = "")
                            Text("Wandering2", color = Color.Black)
                        }



                        val wan3 = LocalContext.current
                        Button(
                            onClick = {wan3.startActivity(Intent(wan3, WanderingActivity3::class.java))},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.White),
                            border = BorderStroke(1.5.dp, Color.Transparent)
                        ){
                            Image(imageVector = Icons.Default.Face, contentDescription = "")
                            Text("Wandering3", color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(500.dp))

                    val register = LocalContext.current
                    Button(
                        onClick = {register.startActivity(Intent(register, InputActivity2::class.java))},
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Green),
                        border = BorderStroke(1.5.dp, Color.Transparent),
                    ){
                        Image(imageVector = Icons.Default.AccountBox, contentDescription = "")
                        Text("Sign in with Phone Number", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    val log = LocalContext.current
                    Button(
                        onClick = {log.startActivity(Intent(log, LogActivity::class.java))},
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.White),
                        border = BorderStroke(1.5.dp, Color.Transparent)
                    ){
                        Image(imageVector = Icons.Default.AccountCircle, contentDescription = "")
                        Text("Sign in with Phone Number", color = Color.Black)
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Text(text = "By creating an account or signing in, you agree to our Terms of Services and Privacy Policy.", textAlign = TextAlign.Center, color = Color.White)
                }
            }
        }
    }
}