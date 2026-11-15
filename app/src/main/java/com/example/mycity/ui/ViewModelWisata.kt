package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.PenyediaDataWisata
import com.example.mycity.model.JenisKategori
import com.example.mycity.model.TempatWisata
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Menyimpan pilihan pengguna (kategori dan tempat wisata) selama aplikasi berjalan.
 */
class

ViewModelWisata : ViewModel() {

    private val _statusAplikasi = MutableStateFlow(StatusAplikasi())
    val statusAplikasi: StateFlow<StatusAplikasi> = _statusAplikasi.asStateFlow()

    fun pilihKategori(jenisKategori: JenisKategori) {
        _statusAplikasi.update { statusSaatIni ->
            statusSaatIni.copy(
                kategoriTerpilih = jenisKategori,
                daftarTempatWisata = PenyediaDataWisata.ambilTempatBerdasarkanKategori(jenisKategori)
            )
        }
    }

    fun pilihTempatWisata(tempatWisata: TempatWisata) {
        _statusAplikasi.update { statusSaatIni ->
            statusSaatIni.copy(tempatTerpilih = tempatWisata)
        }
    }

    fun kembaliKeDaftarWisata() {
        _statusAplikasi.update { statusSaatIni ->
            statusSaatIni.copy(tempatTerpilih = null)
        }
    }

    fun kembaliKeDaftarKategori() {
        _statusAplikasi.update { statusSaatIni ->
            statusSaatIni.copy(
                kategoriTerpilih = null,
                daftarTempatWisata = emptyList(),
                tempatTerpilih = null
            )
        }
    }
}

