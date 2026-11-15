package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.TempatWisata

/**
 * Menyediakan daftar tempat wisata yang tersimpan di dalam aplikasi.
 */
object PenyediaDataWisata {

    private val daftarTempatAlam = listOf(
        TempatWisata(
            id = 1,
            nama = R.string.nama_pantai_parangtritis,
            deskripsi = R.string.deskripsi_pantai_parangtritis,
            lokasi = R.string.lokasi_pantai_parangtritis,
            gambar = R.drawable.foto_pantai_parangtritis,
            jenisKategori = JenisKategori.ALAM
        ),
        TempatWisata(
            id = 2,
            nama = R.string.nama_pantai_indrayanti,
            deskripsi = R.string.deskripsi_pantai_indrayanti,
            lokasi = R.string.lokasi_pantai_indrayanti,
            gambar = R.drawable.foto_pantai_indrayanti,
            jenisKategori = JenisKategori.ALAM
        ),
        TempatWisata(
            id = 3,
            nama = R.string.nama_hutan_pinus_mangunan,
            deskripsi = R.string.deskripsi_hutan_pinus_mangunan,
            lokasi = R.string.lokasi_hutan_pinus_mangunan,
            gambar = R.drawable.hutan_pinus_mangunan,
            jenisKategori = JenisKategori.ALAM
        ),
        TempatWisata(
            id = 4,
            nama = R.string.nama_goa_pindul,
            deskripsi = R.string.deskripsi_goa_pindul,
            lokasi = R.string.lokasi_goa_pindul,
            gambar = R.drawable.foto_goa_pindul,
            jenisKategori = JenisKategori.ALAM
        ),
        TempatWisata(
            id = 5,
            nama = R.string.nama_kaliurang,
            deskripsi = R.string.deskripsi_kaliurang,
            lokasi = R.string.lokasi_kaliurang,
            gambar = R.drawable.foto_kaliurang,
            jenisKategori = JenisKategori.ALAM
        )
    )

    private val daftarTempatBudayaDanSejarah = listOf(
        TempatWisata(
            id = 6,
            nama = R.string.nama_candi_prambanan,
            deskripsi = R.string.deskripsi_candi_prambanan,
            lokasi = R.string.lokasi_candi_prambanan,
            gambar = R.drawable.foto_candi_prambanan,
            jenisKategori = JenisKategori.BUDAYA_DAN_SEJARAH
        ),
        TempatWisata(
            id = 7,
            nama = R.string.nama_keraton_yogyakarta,
            deskripsi = R.string.deskripsi_keraton_yogyakarta,
            lokasi = R.string.lokasi_keraton_yogyakarta,
            gambar = R.drawable.foto_keraton_yogyakarta,
            jenisKategori = JenisKategori.BUDAYA_DAN_SEJARAH
        ),
        TempatWisata(
            id = 8,
            nama = R.string.nama_taman_sari,
            deskripsi = R.string.deskripsi_taman_sari,
            lokasi = R.string.lokasi_taman_sari,
            gambar = R.drawable.foto_taman_sari,
            jenisKategori = JenisKategori.BUDAYA_DAN_SEJARAH
        ),
        TempatWisata(
            id = 9,
            nama = R.string.nama_candi_ratu_boko,
            deskripsi = R.string.deskripsi_candi_ratu_boko,
            lokasi = R.string.lokasi_candi_ratu_boko,
            gambar = R.drawable.foto_candi_ratu_boko,
            jenisKategori = JenisKategori.BUDAYA_DAN_SEJARAH
        ),
        TempatWisata(
            id = 10,
            nama = R.string.nama_benteng_vredeburg,
            deskripsi = R.string.deskripsi_benteng_vredeburg,
            lokasi = R.string.lokasi_benteng_vredeburg,
            gambar = R.drawable.foto_benten_museum_vredeburg,
            jenisKategori = JenisKategori.BUDAYA_DAN_SEJARAH
        )
    )

    private val daftarTempatKuliner = listOf(
        TempatWisata(
            id = 11,
            nama = R.string.nama_gudeg_yu_djum,
            deskripsi = R.string.deskripsi_gudeg_yu_djum,
            lokasi = R.string.lokasi_gudeg_yu_djum,
            gambar = R.drawable.foto_gudeg_yu_jum,
            jenisKategori = JenisKategori.KULINER
        ),
        TempatWisata(
            id = 12,
            nama = R.string.nama_sate_klathak_pak_pong,
            deskripsi = R.string.deskripsi_sate_klathak_pak_pong,
            lokasi = R.string.lokasi_sate_klathak_pak_pong,
            gambar = R.drawable.foto_sate_klatek_pak_pong,
            jenisKategori = JenisKategori.KULINER
        ),
        TempatWisata(
            id = 13,
            nama = R.string.nama_bakpia_pathok,
            deskripsi = R.string.deskripsi_bakpia_pathok,
            lokasi = R.string.lokasi_bakpia_pathok,
            gambar = R.drawable.foto_bakphia_pathok,
            jenisKategori = JenisKategori.KULINER
        ),
        TempatWisata(
            id = 14,
            nama = R.string.nama_kopi_joss_lik_man,
            deskripsi = R.string.deskripsi_kopi_joss_lik_man,
            lokasi = R.string.lokasi_kopi_joss_lik_man,
            gambar = R.drawable.foto_kopi_jos_likman,
            jenisKategori = JenisKategori.KULINER
        ),
        TempatWisata(
            id = 15,
            nama = R.string.nama_mangut_lele_mbah_marto,
            deskripsi = R.string.deskripsi_mangut_lele_mbah_marto,
            lokasi = R.string.lokasi_mangut_lele_mbah_marto,
            gambar = R.drawable.foto_mangut_lele_mbah_marto,
            jenisKategori = JenisKategori.KULINER
        )
    )

    private val daftarTempatBelanja = listOf(
        TempatWisata(
            id = 16,
            nama = R.string.nama_jalan_malioboro,
            deskripsi = R.string.deskripsi_jalan_malioboro,
            lokasi = R.string.lokasi_jalan_malioboro,
            gambar = R.drawable.foto_jalan_malioboro,
            jenisKategori = JenisKategori.BELANJA
        ),
        TempatWisata(
            id = 17,
            nama = R.string.nama_pasar_beringharjo,
            deskripsi = R.string.deskripsi_pasar_beringharjo,
            lokasi = R.string.lokasi_pasar_beringharjo,
            gambar = R.drawable.foto_pasar_beringharjo,
            jenisKategori = JenisKategori.BELANJA
        ),
        TempatWisata(
            id = 18,
            nama = R.string.nama_kotagede,
            deskripsi = R.string.deskripsi_kotagede,
            lokasi = R.string.lokasi_kotagede,
            gambar = R.drawable.foto_kerajinan_perak_kota_gede,
            jenisKategori = JenisKategori.BELANJA
        ),
        TempatWisata(
            id = 19,
            nama = R.string.nama_kasongan,
            deskripsi = R.string.deskripsi_kasongan,
            lokasi = R.string.lokasi_kasongan,
            gambar = R.drawable.foto_kasongan,
            jenisKategori = JenisKategori.BELANJA
        ),
        TempatWisata(
            id = 20,
            nama = R.string.nama_kampung_batik_giriloyo,
            deskripsi = R.string.deskripsi_kampung_batik_giriloyo,
            lokasi = R.string.lokasi_kampung_batik_giriloyo,
            gambar = R.drawable.foto_kampung_batik_giriloyo,
            jenisKategori = JenisKategori.BELANJA
        )
    )

    val semuaTempatWisata: List<TempatWisata> =
        daftarTempatAlam +
            daftarTempatBudayaDanSejarah +
            daftarTempatKuliner +
            daftarTempatBelanja

    fun ambilTempatBerdasarkanKategori(jenisKategori: JenisKategori): List<TempatWisata> {
        return semuaTempatWisata.filter { it.jenisKategori == jenisKategori }
    }
}
