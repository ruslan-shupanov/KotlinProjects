package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(LightGray),
                contentAlignment = Alignment.Center) {
                MainButton()
            }
        }
    }
}


@Composable
private fun MainButton() {

    val counter = remember {
        mutableStateOf(0)
    }

    val color = remember {
        mutableStateOf(Magenta)
    }

    Box(modifier = Modifier
        .size(200.dp)
        .background(color = color.value, shape = CircleShape)
        .clickable {
                   when(++counter.value){
                       0 -> color.value = color.value
                       10 -> color.value = Cyan
                       20 -> color.value = Red
                       30 -> color.value = Black
                       40 -> color.value = LightGray
                       50 -> color.value = Green
                       60 -> color.value = Blue
                       70 -> color.value = DarkGray
                       80 -> color.value = White
                       90 -> color.value = Yellow
                       100 -> color.value = Magenta
                       101 -> counter.value = 0
                   }
                   },
        contentAlignment = Alignment.Center){
        Text(text = "${counter.value}", style = TextStyle(color = White, fontSize = 70.sp))
    }
}
