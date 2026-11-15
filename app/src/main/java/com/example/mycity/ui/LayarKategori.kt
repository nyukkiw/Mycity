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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.data.PenyediaDataKategori
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.KategoriWisata
import com.example.mycity.ui.theme.MycityTheme

/**
 * Layar pertama: menampilkan daftar kategori wisata.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayarKategori(
    daftarKategori: List<KategoriWisata>,
    saatKategoriDipilih: (JenisKategori) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = { Text(text = stringResource(R.string.judul_layar_kategori)) })
        }
    ) { jarakDalam ->
        LazyColumn(
            modifier = Modifier.padding(jarakDalam),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(daftarKategori) { kategori ->
                KartuKategori(
                    kategori = kategori,
                    saatDiklik = { saatKategoriDipilih(kategori.jenis) }
                )
            }
        }
    }
}

@Composable
private fun KartuKategori(
    kategori: KategoriWisata,
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
                painter = painterResource(kategori.gambar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = stringResource(kategori.nama),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PratinjauLayarKategori() {
    MycityTheme {
        LayarKategori(
            daftarKategori = PenyediaDataKategori.daftarKategori,
            saatKategoriDipilih = {}
        )
    }
}
