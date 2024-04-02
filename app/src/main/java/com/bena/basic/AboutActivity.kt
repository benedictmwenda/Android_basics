package com.bena.basic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bena.basic.MainActivity

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About(){
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize(),

//        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
        ) {
            Text ("Impala logo")
            Spacer(modifier = Modifier.width(10.dp))
            Text ("Home")
            Spacer(modifier = Modifier.width(10.dp))
            Text ("Categories")
            Spacer(modifier = Modifier.width(10.dp))
            Text ("My Cart")
            Spacer(modifier = Modifier.width(10.dp))
            Text("Pay")
        }

        Spacer(modifier = Modifier.height(20.dp))

        val main = LocalContext.current
        Button(onClick = { main.startActivity(Intent(main, MainActivity::class.java)) }
            
        )
        {
            Text(text = "Home screen")
        }
        Text("This is my About activity.",
            color = Color.Cyan, fontSize = 10.sp, fontFamily = FontFamily.Serif,
            modifier = Modifier.background(Color.Black))
        Text("All About Me.", fontFamily = FontFamily.Cursive)
    }
}
