package com.example.inputpengguna

import com.example.pertemuan5.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FormatDataDiri(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val statusKawin = listOf("Janda", "Lajang", "Duda")

    Column(
        modifier = modifier
            .padding(top = 50.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Nama Lengkap
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = stringResource(R.string.nama_lengkap)) },
            onValueChange = { textNama = it }
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = stringResource(R.string.jenis_kelamin),
            style = MaterialTheme.typography.bodyLarge
        )
        Row {
            gender.forEach { item ->
                Row(
                    modifier = Modifier
                        .selectable(
                            selected = textJK == item,
                            onClick = { textJK = item }
                        )
                        .padding(end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = { textJK = item }
                    )
                    Text(text = item)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Status Perkawinan
        Text(
            text = stringResource(R.string.status_perkawinan),
            style = MaterialTheme.typography.bodyLarge
        )
        Row {
            statusKawin.forEach { item ->
                Row(
                    modifier = Modifier
                        .selectable(
                            selected = textStatus == item,
                            onClick = { textStatus = item }
                        )
                        .padding(end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textStatus == item,
                        onClick = { textStatus = item }
                    )
                    Text(text = item)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Alamat Lengkap
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),
            label = { Text(text = stringResource(R.string.alamat_lengkap)) },
            onValueChange = { textAlamat = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Tombol Submit
        Button(
            modifier = Modifier.fillMaxWidth(),
            enabled = textAlamat.isNotEmpty(),
            onClick = {
                nama = textNama
                jenis = textJK
                alamat = textAlamat
                status = textStatus
            }
        ) {
            Text(text = stringResource(R.string.submit))
        }

        Spacer(modifier = Modifier.height(16.dp))


        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            modifier = Modifier
                .height(150.dp)
                .width(300.dp)
        ) {
            Column(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp)) {
                Text(text = "Nama   : $nama", color = Color.White)
                Text(text = "Gender : $jenis", color = Color.White)
                Text(text = "Alamat : $alamat", color = Color.White)
                Text(text = "Status : $status", color = Color.White)
            }
        }
    }
}
