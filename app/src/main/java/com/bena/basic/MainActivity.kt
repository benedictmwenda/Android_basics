package com.bena.basic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize()
            .padding(15.dp),

//        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.Start
    )
    {
        Text(text = "Android Project SetUp.", color = Color.Cyan)
        val gg = LocalContext.current
        Text("Add a Text",
            modifier = Modifier
                .clickable {
                    gg.startActivity(Intent(gg, AboutActivity::class.java))
                }
        )

//ABOUT BUTTON
        val about = LocalContext.current
        Button(
            onClick = { about.startActivity(Intent(about, AboutActivity::class.java)) },
//            colors = ButtonDefaults.buttonColors(Color.Cyan),
//            shape = RectangleShape
            shape = RoundedCornerShape(15.dp),
//            shape = CutCornerShape(15),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        )
        {
            Text(text = "About screen", color = Color.Black)
        }

        val online = LocalContext.current
        Button(
            onClick = { online.startActivity(Intent(online, OnlineActivity::class.java)) },
//            colors = ButtonDefaults.buttonColors(Color.Cyan),
//            shape = RectangleShape
            shape = RoundedCornerShape(15.dp),
//            shape = CutCornerShape(15),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        )
        {
            Text(text = "Online Screen", color = Color.Black)
        }

        val web = LocalContext.current
        Button(
            onClick = { web.startActivity(Intent(web, WebActivity::class.java)) },
//            colors = ButtonDefaults.buttonColors(Color.Cyan),
//            shape = RectangleShape
            shape = RoundedCornerShape(15.dp),
//            shape = CutCornerShape(15),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        )
        {
            Text(text = "Web Screen", color = Color.Black)
        }

//IMAGE BUTTON
        val img = LocalContext.current
        Button(
            onClick = {img.startActivity(Intent(img, ImageActivity::class.java))},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        ){
            Text("Images", color = Color.Gray)
        }

        val cards = LocalContext.current
        Button(
            onClick = {cards.startActivity(Intent(cards, CardActivity::class.java))},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        ){
            Text("Cards", color = Color.Gray)
        }

        val inp = LocalContext.current
        Button(
            onClick = {inp.startActivity(Intent(inp, InputActivity2::class.java))},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Blue),
            border = BorderStroke(1.5.dp, Color.Cyan)
        ){
            Text("Sign In", color = Color.Red)
        }



        val abt = AnnotatedString("Already have an Account?Log in...", spanStyle = SpanStyle(Color.LightGray))
        val ab = LocalContext.current
        ClickableText(text = abt , onClick = {ab.startActivity(Intent(ab, LogActivity::class.java))})
        
    }


}