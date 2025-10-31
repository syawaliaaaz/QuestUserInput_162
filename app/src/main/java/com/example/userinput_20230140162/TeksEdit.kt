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

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Nama Lengkap") },

            onValueChange = {
                textName = it
            }
        )
        Row {

    }
}