package com.example.mycity.ui

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.mycity.R

/**
 * Tampilan utama aplikasi yang mengatur perpindahan layar sesuai [StatusAplikasi]
 * serta menangani tombol kembali bawaan perangkat.
 */
@Composable
fun AplikasiMyCity(
    viewModelWisata: ViewModelWisata,
    modifier: Modifier = Modifier
) {
    val statusAplikasi by viewModelWisata.statusAplikasi.collectAsState()
    val kategoriTerpilih = statusAplikasi.kategoriTerpilih
    val tempatTerpilih = statusAplikasi.tempatTerpilih

    when {
        tempatTerpilih != null -> {
            BackHandler(onBack = viewModelWisata::kembaliKeDaftarWisata)
            LayarDetailWisata(
                tempatWisata = tempatTerpilih,
                saatTombolKembaliDiklik = viewModelWisata::kembaliKeDaftarWisata,
                modifier = modifier
            )
        }

        kategoriTerpilih != null -> {
            val judulKategori = statusAplikasi.daftarKategori
                .firstOrNull { it.jenis == kategoriTerpilih }
                ?.nama ?: R.string.judul_layar_kategori

            BackHandler(onBack = viewModelWisata::kembaliKeDaftarKategori)
            LayarDaftarWisata(
                judulKategori = judulKategori,
                daftarTempatWisata = statusAplikasi.daftarTempatWisata,
                saatTempatDipilih = viewModelWisata::pilihTempatWisata,
                saatTombolKembaliDiklik = viewModelWisata::kembaliKeDaftarKategori,
                modifier = modifier
            )
        }

        else -> {
            LayarKategori(
                daftarKategori = statusAplikasi.daftarKategori,
                saatKategoriDipilih = viewModelWisata::pilihKategori,
                modifier = modifier
            )
        }
    }
}
