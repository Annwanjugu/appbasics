package com.mor.evening

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mor.evening.ui.theme.EveningTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
    Box(modifier = Modifier
        .fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.zz),
            contentDescription ="" ,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop)

        
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                var name by remember {

                    mutableStateOf(TextFieldValue(""))
                }

                TextField(value = name, onValueChange = { name = it })


                Spacer(modifier = Modifier.height(25.dp))
                var email by remember {

                    mutableStateOf(TextFieldValue(""))
                }

                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "enter name") }

                )
                Spacer(modifier = Modifier.height(25.dp))


                var password by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "password") },
                    textStyle = TextStyle(Color.Yellow),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color.Blue,
                        focusedBorderColor = Color.Blue,
                        unfocusedLabelColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        cursorColor = Color.Green,



                    )
                )
            }



    }
}












