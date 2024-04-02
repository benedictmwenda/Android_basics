package com.bena.basic

import android.content.Intent
import android.graphics.drawable.Icon
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}


// TEXT FILL


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input(){
    Box(modifier = Modifier
        .background(Color.DarkGray)
        .padding(10.dp)
        .fillMaxSize(),
    ){
        Image(painter = painterResource
            (id = R.drawable.web),
            contentDescription = "Impala Shop",
            modifier = Modifier
                .fillMaxSize()
//                .clip(CircleShape)
            ,
            contentScale = ContentScale.Crop
        )
        Text(text = "Sign In ")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(20.dp))


            var name by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Enter Name", color = Color.Black)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "")}
            )

            Spacer(modifier = Modifier.height(20.dp))

            var email by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email", color = Color.Black)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") }
            )

            Spacer(modifier = Modifier.height(20.dp))

            var phone by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it},
                label = {Text(text = "Phone(+254)", color = Color.White)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                leadingIcon = {Icon(imageVector = Icons.Default.Phone, contentDescription = "")}
            )

            Spacer(modifier = Modifier.height(20.dp))

            var passw by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = passw,
                onValueChange = { passw = it},
                label = {Text(text = "Password", color = Color.White)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                textStyle = TextStyle(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Cyan,
                    focusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.White,
                    unfocusedBorderColor = Color.Red,
                    unfocusedLabelColor = Color.Red,
                    cursorColor = Color.Gray

                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            var passc by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = passc,
                onValueChange = { passc = it},
                label = {Text(text = "Re-Enter the Password", color = Color.White)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType. NumberPassword),
                textStyle = TextStyle(Color.White)
            )

            Spacer(modifier = Modifier.height(20.dp))


            // BUTTON SECTION
            val sign = LocalContext.current
            Button(
                onClick = {sign.startActivity(Intent(sign, MainActivity::class.java))},
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.outlinedButtonColors(Color.Blue),
                border = BorderStroke(1.5.dp, Color.Cyan)
            ){
                Text("Sign In", color = Color.Gray)
            }



            val abt = AnnotatedString("Already have an Acount? Log in ", spanStyle = SpanStyle(Color.LightGray))
            val ab = LocalContext.current
            ClickableText(text = abt , onClick = {ab.startActivity(Intent(ab, LogActivity::class.java))})
        }
        }
}

