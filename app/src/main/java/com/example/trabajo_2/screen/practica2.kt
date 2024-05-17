package com.example.trabajo_2.screen

import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trabajo_2.R
import com.example.trabajo_2.ui.theme.Orange

@Composable
fun Main(){
    Box(modifier = Modifier.fillMaxSize(), ){
        Content();
    }
}

@Composable
fun Content(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .padding(15.dp), verticalArrangement = Arrangement.SpaceAround,){
        Filas(img = R.drawable.img001, description = "#####")
        Text(
            text = "Please use the link below to verify your email and start your journey",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = Color.Gray
        )
        Button(onClick={/*TODO*/},modifier=Modifier.fillMaxWidth(),colors= ButtonDefaults.buttonColors(
            Color.Yellow)){
            Text(text="Verify Email", fontSize = 16.sp, color=Color.Black)
        }
        Column(modifier = Modifier){
            Text(
                text = "Do you Have any question?",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
            Text(
                text = "contact@email.com",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Orange
            )
        }
    }
}

@Composable
fun Filas(img: Int, description: String, imgmodifier: Modifier = Modifier){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Image(painterResource(id = img), contentDescription = description, modifier = Modifier
            .width(350.dp)
            .height(350.dp))
    }
}


@Preview(name = "practica_2", showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain(){
    Main()
}