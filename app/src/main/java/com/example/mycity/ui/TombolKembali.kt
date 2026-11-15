package com.example.mycity.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.mycity.R

/**
 * Tombol kembali pada bar atas untuk kembali ke layar sebelumnya.
 */
@Composable
fun TombolKembali(
    saatDiklik: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = saatDiklik,
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = stringResource(R.string.deskripsi_tombol_kembali)
        )
    }
}

