package com.example.questnavigasimvvm_0262.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
){
    val items = listOf(
    Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
    Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
    Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
}