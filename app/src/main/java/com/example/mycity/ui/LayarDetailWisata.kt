package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.data.PenyediaDataWisata
import com.example.mycity.model.TempatWisata
import com.example.mycity.ui.theme.MycityTheme

/**
 * Layar ketiga: menampilkan foto, lokasi, dan deskripsi satu tempat wisata.
 *
 * TODO (penyambungan): tombol kembali di bar atas memanggil
 *  ViewModelWisata.kembaliKeDaftarWisata().
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayarDetailWisata(
    tempatWisata: TempatWisata,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = { Text(text = stringResource(tempatWisata.nama)) })
        }
    ) { jarakDalam ->
        Column(
            modifier = Modifier
                .padding(jarakDalam)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(tempatWisata.gambar),
                contentDescription = stringResource(tempatWisata.nama),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = stringResource(R.string.label_lokasi),
                    style = MaterialTheme.typography.labelLarge
                )
                Text(
                    text = stringResource(tempatWisata.lokasi),
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = stringResource(R.string.label_tentang_tempat),
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = stringResource(tempatWisata.deskripsi),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PratinjauLayarDetailWisata() {
    MycityTheme {
        LayarDetailWisata(tempatWisata = PenyediaDataWisata.semuaTempatWisata.first())
    }
}
