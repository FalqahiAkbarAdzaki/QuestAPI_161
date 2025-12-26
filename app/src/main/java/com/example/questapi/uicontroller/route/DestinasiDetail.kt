package com.example.questapi.uicontroller.route

import com.example.questapi.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_detail"
    override val titleRes = R.string.detail_siswa

    @Suppress("ktlint:standard:property-naming")
    const val itemIdArg = "id"
    val routeWithArgs = "$route/{$itemIdArg}"
}
