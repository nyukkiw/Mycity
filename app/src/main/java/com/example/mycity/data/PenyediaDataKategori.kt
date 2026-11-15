package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.KategoriWisata

/**
 * Menyediakan daftar kategori wisata yang tersimpan di dalam aplikasi.
 */
object PenyediaDataKategori {

    val daftarKategori: List<KategoriWisata> = listOf(
        KategoriWisata(
            jenis = JenisKategori.ALAM,
            nama = R.string.kategori_alam,
            gambar = R.drawable.foto_kategori_alam
        ),
        KategoriWisata(
            jenis = JenisKategori.BUDAYA_DAN_SEJARAH,
            nama = R.string.kategori_budaya_dan_sejarah,
            gambar = R.drawable.foto_kategori_budaya_sejarah
        ),
        KategoriWisata(
            jenis = JenisKategori.KULINER,
            nama = R.string.kategori_kuliner,
            gambar = R.drawable.foto_kategori_kuliner
        ),
        KategoriWisata(
            jenis = JenisKategori.BELANJA,
            nama = R.string.kategori_belanja,
            gambar = R.drawable.foto_kategori_belanja
        )
    )
}
