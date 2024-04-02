package com.bena.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cards()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Cards(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
            ) {

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black
                    )
                ) {
                    Image(painter = painterResource(id = R.drawable.impala), contentDescription = "")
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = "Impala")
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Impala design")

                        }
                }

            }
        }
    }
}
