package com.example.curitseacaresociety

import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.curitseacaresociety.ui.theme.CuritseaCareSocietyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            WebViewPage(url = "https://ccskenya.org/")
            CurtiseaWebView(url = "https://ccskenya.org/")
        }
    }
}


@Composable
fun CurtiseaWebView(url: String) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                loadUrl(url)
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}


