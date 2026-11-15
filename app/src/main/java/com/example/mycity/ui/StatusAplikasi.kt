package com.example.mycity.ui

import com.example.mycity.data.PenyediaDataKategori
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.KategoriWisata
import com.example.mycity.model.TempatWisata

/**
 * Kumpulan data yang dipakai untuk menampilkan layar aplikasi.
 *
 * [kategoriTerpilih] dan [tempatTerpilih] bernilai null selama pengguna belum memilihnya.
 */
data class StatusAplikasi(
    val daftarKategori: List<KategoriWisata> = PenyediaDataKategori.daftarKategori,
    val kategoriTerpilih: JenisKategori? = null,
    val daftarTempatWisata: List<TempatWisata> = emptyList(),
    val tempatTerpilih: TempatWisata? = null
)
