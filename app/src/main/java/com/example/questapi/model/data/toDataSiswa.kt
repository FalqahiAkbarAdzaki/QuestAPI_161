@file:Suppress("ktlint:standard:filename")

package com.example.questapi.model.data

fun DetailSiswa.toDataSiswa(): DataSiswa =
    DataSiswa(
        id = id,
        nama = nama,
        alamat = alamat,
        telpon = telpon,
    )
