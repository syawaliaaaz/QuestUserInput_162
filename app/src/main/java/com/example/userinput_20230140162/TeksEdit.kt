package com.example.userinput_20230140162

@Composable

fun FormDataDiri(modifier: Modifier
){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard

    var textNama by remember {mutableStateOf("")}

    var textAlamat by remember {mutableStateOf("")}

    var textJk by remember {mutableStateOf("")}

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI

    var nama by remember {mutableStateOf("")}

    var alamat by remember {mutableStateOf("")}

    var jenis by remember {mutableStateOf("")}

    val gender:list<String> = listOf("Laki-laki", "Perempuan")
}