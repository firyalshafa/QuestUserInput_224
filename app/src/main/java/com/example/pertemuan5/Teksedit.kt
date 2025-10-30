package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier
import java.text.Format

@Composable
fun FormatDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf(value="") }
    var textAlamt by remember { mutableStateOf(value = "") }

}