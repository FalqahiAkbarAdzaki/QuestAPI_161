@file:Suppress("ktlint:standard:filename")

package com.example.questapi.model.data

fun DataSiswa.toDetailSiswa(): DetailSiswa =
    DetailSiswa(
        id = id,
        nama = nama,
        alamat = alamat,
        telpon = telpon,
    )
