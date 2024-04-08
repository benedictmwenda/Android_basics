package com.bena.basic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class RuthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ruth()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Ruth() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
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
                    contentScale = ContentScale.Fit
                )
                Column {

                Row(
//                horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                ) {
                    Image(imageVector = Icons.Default.Face ,"")
                    Text("Travelezy")
                }
                Column {
                    Text(text = "Explore the world here")
                    Text(text = "The best travel")

                    Spacer(modifier = Modifier.height(200.dp))

                    val cr= LocalContext.current
                    Button(
                        onClick = {cr.startActivity(Intent(cr, CardActivity::class.java))},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.AccountCircle, contentDescription = "")
                        Text("Create an Account", color = Color.Black)

                        val ruth = AnnotatedString("Already have an Account?Log in...", spanStyle = SpanStyle(Color.LightGray))
                        val th = LocalContext.current
                        ClickableText(text = ruth , onClick = {th.startActivity(Intent(th, LogActivity::class.java))})
                    }
                }
            }
            }
        }
    }
}