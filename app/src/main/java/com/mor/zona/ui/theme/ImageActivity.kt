package com.mor.zona.ui.theme

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mor.evening.R
import com.mor.zona.MainActivity
import com.mor.zona.ui.theme.ui.theme.EveningTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting4() {

Column( ) {


    val about = LocalContext.current
    Button(onClick = { about.startActivity(Intent(about, MainActivity::class.java)) })
    {
        Text(text = "about")
    }
    Image(painter = painterResource(id = R.drawable.zz) , contentDescription = "",
        modifier = Modifier
            .size(90.dp)


    )

}
}

