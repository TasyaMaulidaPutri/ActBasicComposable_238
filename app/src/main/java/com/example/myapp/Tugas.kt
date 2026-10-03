package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas( modifier: Modifier = Modifier) {
    val background = painterResource(id = R.drawable.bg_graduation)
    val logo = painterResource(id = R.drawable.umy_logo)
    val foto = painterResource(id = R.drawable.graduation)

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Text(text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray)
            Text(
                text = "ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = logo,
                contentDescription = "UMY logo",
                modifier = Modifier.size(130.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}