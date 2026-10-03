package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

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
    }
}