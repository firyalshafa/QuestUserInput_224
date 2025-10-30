package com.example.pertemuan5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

    Column (modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = textNama,
            singleLine = true,

        )
    }


}