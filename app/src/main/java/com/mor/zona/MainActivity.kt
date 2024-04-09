package com.mor.zona

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mor.evening.InputActivity
import com.mor.zona.ui.theme.ZonaTheme

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
        .background(Color.Cyan)
        .fillMaxSize()


) {

    Text(text = "Majorly app")
    Text(text = "AS")
    Text(text = "MANY")
    Text(text = "AS")
    Text(text = "I")
    Text(text = "WANT", color = Color.Yellow, fontSize = 38.sp, fontFamily = FontFamily.Cursive)
    
    
    
    
//
//        val a = LocalContext.current
//val b = AnnotatedString("bdsbvfdsfkl")
//
//ClickableText(text = b) {
//
//        a.startActivity(Intent(a, AboutActivity2::class.java))



    val aa = LocalContext.current
    Text(text = "Click Here to go home",
        modifier = Modifier.clickable {

        aa.startActivity(Intent(aa, AboutActivity2::class.java))
    } )
}
    
    val inp = LocalContext.current
    Text(text = "Input",
    modifier = Modifier
        .clickable {
            inp.startActivity(Intent(inp,InputActivity::class.java))
        }
    )





    val emai = LocalContext.current
    Text(text = "Input",
        modifier = Modifier
            .clickable {
                inp.startActivity(Intent(inp,InputActivity::class.java))
            }

    )















}




