package com.example.questnavigasimvvm_0262.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.questnavigasimvvm_0262.R


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
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    )
}