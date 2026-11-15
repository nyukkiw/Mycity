package com.example.mycity.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

/**
 * Tampilan utama aplikasi.
 *
 * TODO (penyambungan): saat ini hanya LayarKategori yang tampil.
 *  Sambungkan perpindahan layar sesuai [StatusAplikasi]:
 *  kategoriTerpilih == null            -> LayarKategori
 *  kategoriTerpilih != null            -> LayarDaftarWisata
 *  tempatTerpilih != null              -> LayarDetailWisata
 *  Jangan lupa tangani tombol kembali bawaan HP.
 */
@Composable
fun AplikasiMyCity(
    viewModelWisata: ViewModelWisata,
    modifier: Modifier = Modifier
) {
    val statusAplikasi by viewModelWisata.statusAplikasi.collectAsState()

    LayarKategori(
        daftarKategori = statusAplikasi.daftarKategori,
        saatKategoriDipilih = viewModelWisata::pilihKategori,
        modifier = modifier
    )
}
