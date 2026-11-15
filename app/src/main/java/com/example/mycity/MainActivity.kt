package com.example.mycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.mycity.ui.AplikasiMyCity
import com.example.mycity.ui.ViewModelWisata
import com.example.mycity.ui.theme.MycityTheme

class MainActivity : ComponentActivity() {

    private val viewModelWisata: ViewModelWisata by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MycityTheme {
                AplikasiMyCity(viewModelWisata = viewModelWisata)
            }
        }
    }
}
