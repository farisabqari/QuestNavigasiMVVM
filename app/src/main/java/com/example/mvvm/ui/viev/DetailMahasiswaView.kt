package com.example.mvvm.ui.viev

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import com.example.mvvm.Model.DataMahasiswa


@Composable
fun DetailMahasiswaView(
    modifier: Modifier = Modifier,
    uiStateMahasiswa: DataMahasiswa,
    onClickButton: () -> Boolean
)
{
    val listDataMhs = listOf(
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Gender", uiStateMahasiswa.gender),
        Pair("Email", uiStateMahasiswa.email),
        Pair("Alamat", uiStateMahasiswa.alamat),
        Pair("NoHP", uiStateMahasiswa.nohp),
    )

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp)
    ){
        listDataMhs.forEach{ items ->
            CardSection(
                judulParam = items.first,
                isiParam = items.second
            )

