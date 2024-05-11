package com.example.helloworld

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WeightExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        MyBox(modifier =Modifier.weight(1f))
        MyBox(color = Color.Green,modifier =Modifier.weight(2f))
        MyBox(color = Color.Cyan,modifier =Modifier.weight(3f))
        MyBox(color = Color.Yellow,modifier =Modifier.weight(1f))
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier, color: Color = Color.Red) {
    Surface(
        color = color,
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {

    }
}

@Preview
@Composable
fun WeightExamplePreview() {
    WeightExample()
}