package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Data satu tempat wisata yang ditampilkan di layar daftar dan layar detail.
 */
data class TempatWisata(
    val id: Int,
    @StringRes val nama: Int,
    @StringRes val deskripsi: Int,
    @StringRes val lokasi: Int,
    @DrawableRes val gambar: Int,
    val jenisKategori: JenisKategori
)
