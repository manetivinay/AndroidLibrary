package com.vinaymaneti.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinaymaneti.androidlibrary.ui.theme.AndroidLibraryTheme
import com.vinaymaneti.image_preview.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLibraryTheme {
              Box(
                  modifier = Modifier.fillMaxSize()
              ) {
                  ImagePreview(
                      image = painterResource(id = R.drawable.kermit_1),
                      description = "HelloWorld",
                      modifier = Modifier.align(Alignment.Center).size(150.dp)
                  )
              }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidLibraryTheme {
        Greeting("Android")
    }
}