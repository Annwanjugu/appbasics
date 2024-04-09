package com.mor.zona

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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

class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
        }
    }


@Preview(showBackground = true)
@Composable
fun Greeting3() {
Column (     modifier = Modifier
    .background(Color.Gray)
    // .fillMaxWidth()
//    .fillMaxHeight()
    .fillMaxSize()
    .padding(50.dp)
    ,
    horizontalAlignment = Alignment.CenterHorizontally,
//    verticalArrangement = Arrangement.Center

){
    Row {


        Text(text = "About page")
        Spacer(modifier = Modifier
            .height(20.dp)
            .width(30.dp))

            Text(text = "settings")

    }
    Text(text = "FINALLY", fontSize = 15.sp, fontFamily = FontFamily.Cursive,
    modifier = Modifier
    .background(Color.Yellow))
}
    
    val main = LocalContext.current
    Button(onClick = { main.startActivity(Intent(main, MainActivity::class.java)) })
    {
        Text(text = "MAIN")
    }

    
    
    
    
}

