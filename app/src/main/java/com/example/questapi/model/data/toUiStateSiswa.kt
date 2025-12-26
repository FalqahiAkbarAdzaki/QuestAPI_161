@file:Suppress("ktlint:standard:filename")

package com.example.questapi.model.data

fun DataSiswa.toUiStateSiswa(isEntryValid: Boolean = false): UiStateSiswa =
    UiStateSiswa(
        detailSiswa = this.toDetailSiswa(),
        isEntryValid = isEntryValid,
    )
