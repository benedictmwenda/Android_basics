package com.bena.basic

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Picha()
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Picha() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(1.5.dp)
    ){

        androidx.compose.foundation.Image(painter = painterResource
            (id = R.drawable.impala),
            contentDescription = "Impala Shop",
            modifier = Modifier
                .size(80.dp)
                .background(Color.Cyan)
//                .clip(CircleShape)
            ,
            colorFilter = ColorFilter.tint(Color.Black),
            contentScale = ContentScale.Crop
            )

        val can = LocalContext.current
        Button(
            onClick = {can.startActivity(Intent(can, MainActivity::class.java))},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Cyan)
        ){
            Text("Cancel", color = Color.Red)
        }
    }

}
