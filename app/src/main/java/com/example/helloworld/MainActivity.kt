package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloworldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    HelloworldTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
//            Greeting("Android")
//            BoxExample()
//            ImageWithText()
            WeightExample(modifier = Modifier.fillMaxSize())
        }

    }
}

@Composable
fun ImageWithText() {
    Box(
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.pic_chart),
            contentDescription = null,
//            contentScale = ContentScale.Crop,
            alpha = 0.5f,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "Hello COmpose,",
            fontSize = 25.sp
        )
    }
}

@Composable
fun BoxExample() {
    Box {
        Surface(
            color = Color.Red,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)

        ) {

        }
        Surface(
            color = Color.Green,
            shape = RoundedCornerShape(percent = 10),
            modifier = Modifier
                .fillMaxWidth()
                .width(100.dp)
                .padding(top = 150.dp, start = 24.dp, end = 24.dp)
                .height(100.dp)

        )
        {

        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 25.sp,
            color = Color.Red,
            modifier = modifier
        )
        Text(
            text = "Hello $name!",
            fontSize = 25.sp,
            color = Color.Blue,
            modifier = modifier
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            Icon(Icons.Filled.Favorite, contentDescription = null)
            Text(text = "Call", fontSize = 25.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}