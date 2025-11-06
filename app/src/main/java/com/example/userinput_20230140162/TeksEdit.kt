package com.example.userinput_20230140162

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier


@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {
    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJk by remember { mutableStateOf("") }

    // variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    // Perbaikan: Mengganti 'list<String>' menjadi 'List<String>' dan menambahkan spasi setelah titik dua
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = Modifier.padding(top = 50.dp).then(modifier),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. OutlinedTextField (Nama)
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp).padding(bottom = 16.dp), // Menambahkan padding bawah

            label = { Text(text = "Nama Lengkap") },

            onValueChange = {
                // Perbaikan: Mengganti 'textName' menjadi 'textNama' (sesuai definisi variabel)
                textNama = it
            }
        )

        // 2. Row (Jenis Kelamin)
        Row(
            modifier = Modifier.padding(horizontal = 40.dp) // Tambahkan padding horizontal agar tidak terlalu mepet
        ) {

            gender.forEach { item ->
                Row(
                    modifier = Modifier.selectable(
                        // Perbaikan: Mengganti 'text.Jk' menjadi 'textJk'
                        selected = textJk == item,

                        onClick = { textJk = item }

                    ),  verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textJk == item,

                        onClick = {
                            textJk = item
                        }
                    )
                    Text(item)
                }
                // Perbaikan: Menghapus kurung tutup yang berlebihan dan tidak terstruktur di sini
            } // Penutup forEach
        } // Penutup Row

        // 3. OutlinedTextField (Alamat)
        // Perbaikan: Menambahkan syntax yang hilang dan memperbaiki spasi di 'text Alamat'
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Alamat lengkap") },

            onValueChange = {
                textAlamat = it
            }
        )

        Divider(
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium), top = dimensionResource(
                id = R.dimen.padding_medium
            )),
            thickness = dimensionResource(R.dimen.divider_tipis),
            color = Color.DarkGray
        )
        Button(
            modifier = Modifier.fillMaxWidth(1f),
            //the button is enabled when the user makes a selection
            enabled = textAlamat.IsNotEmpty(),

            onClick = {
                nama=textNama
                jenis=textJk
                alamat=textAlamat
            }
        ) {
            Text(stringResource(R.string.submit))
        }

        Divider(
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium, top = dimensionResource(
                id = R.dimen.padding_medium
            )),
                thickness = dimensionResource(R.dimen.divider_tipis),
                color = Color.DarkGray
        )

        ElevatedCard (
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            modifier = Modifier
                .height(100.dp)
                .width(300.dp)
    } {
        Column (modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp),){
            Text(text = "Nama   : "+nama, color = Color.White )
            Text(text = "Gender : "+jenis, color = Color.White )
            Text(text = "Alamat : "+alamat, color = Color.White )
        }
    }
        )
    }
}