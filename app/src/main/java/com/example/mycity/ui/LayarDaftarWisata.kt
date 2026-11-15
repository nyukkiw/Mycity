package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.PenyediaDataWisata
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.TempatWisata
import com.example.mycity.ui.theme.MycityTheme

/**
 * Layar kedua: menampilkan daftar tempat wisata pada kategori yang dipilih.
 *
 * TODO (penyambungan): tombol kembali di bar atas memanggil
 *  ViewModelWisata.kembaliKeDaftarKategori().
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayarDaftarWisata(
    daftarTempatWisata: List<TempatWisata>,
    saatTempatDipilih: (TempatWisata) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            // TODO (penyambungan): tampilkan nama kategori yang dipilih sebagai judul.
            TopAppBar(title = { Text(text = "") })
        }
    ) { jarakDalam ->
        LazyColumn(
            modifier = Modifier.padding(jarakDalam),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(daftarTempatWisata, key = { it.id }) { tempatWisata ->
                KartuTempatWisata(
                    tempatWisata = tempatWisata,
                    saatDiklik = { saatTempatDipilih(tempatWisata) }
                )
            }
        }
    }
}

@Composable
private fun KartuTempatWisata(
    tempatWisata: TempatWisata,
    saatDiklik: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = saatDiklik)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(tempatWisata.gambar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(88.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = stringResource(tempatWisata.nama),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = stringResource(tempatWisata.lokasi),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PratinjauLayarDaftarWisata() {
    MycityTheme {
        LayarDaftarWisata(
            daftarTempatWisata = PenyediaDataWisata.ambilTempatBerdasarkanKategori(JenisKategori.ALAM),
            saatTempatDipilih = {}
        )
    }
}
