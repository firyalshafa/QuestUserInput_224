package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier
import java.text.Format

@Composable
fun FormatDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJk by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf(value = ) }
    var  alamat by remember { mutableStateOf(value = ) }
    var jenis by remember { mutableStateOf(value = ) }

    val gender: List<String> = listOf("laki laki","perempuan")

}