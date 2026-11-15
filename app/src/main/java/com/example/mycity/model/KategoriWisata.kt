package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Data satu kategori wisata yang ditampilkan di layar kategori.
 */
data class KategoriWisata(
    val jenis: JenisKategori,
    @StringRes val nama: Int,
    @DrawableRes val gambar: Int
)
