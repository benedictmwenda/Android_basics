package com.bena.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bena.basic.ui.theme.BasicTheme

class LogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lazy()
        }
    }
}


//LAZY FUNTION


@Preview(showBackground = true)
@Composable
fun Lazy(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item { 
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text("hello")
                Spacer(modifier = Modifier.width(500.dp))
                Text(text = "Here <application>...</application> tags enclosed the components related to the application.\n" +
                        "Attribute android:icon will point to the application icon available underres/drawable-hdpi. The\n" +
                        "application uses the image named ic_launcher.png located in the drawable folders.\n" +
                        "The <activity> tag is used to specify an activity and android:name attribute specifies the fully\n" +
                        "qualified class name of the Activity subclass and the android:label attributes specifies a string\n" +
                        "to use as the label for the activity. You can specify multiple activities using <activity> tags.\n" +
                        "The action for the intent filter is named android.intent.action.MAIN to indicate that this\n" +
                        "activity serves as the entry point for the application. The category for the intent-filter is\n" +
                        "named android.intent.category.LAUNCHER to indicate that the application can be launched\n" +
                        "from the device's launcher icon.\n" +
                        "The @string refers to the strings.xml file explained below. Hence, @string/app_name refers to\n" +
                        "the app_name string defined in the strings.xml file, which is \"HelloWorld\". Similar way, other\n" +
                        "strings get populated in the application.\n" +
                        "Following is the list of tags which you will use in your manifest file to specify different Android\n" +
                        "application components:\n" +
                        "Android\n" +
                        "36\n" +
                        "\uF0B7 <activity>elements for activities\n" +
                        "\uF0B7 <service> elements for services\n" +
                        "\uF0B7 <receiver> elements for broadcast receivers\n" +
                        "\uF0B7 <provider> elements for content providers"
                    
                )


            }
        }
    }
}
