package com.doganur.migrosapp.feature.categories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R
import com.doganur.migrosapp.feature.categories.components.CategoriesCampaignBannerList
import com.doganur.migrosapp.feature.categories.components.CategoriesList
import com.doganur.migrosapp.feature.categories.components.CategoriesSearchBar
import com.doganur.migrosapp.feature.categories.model.Banner
import com.doganur.migrosapp.feature.categories.model.Category

@Composable
fun CategoriesScreen() {

    val campaignImageList = listOf(
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat),
        Banner(imageId = R.drawable.migros_firsat)
    )

    val categoryItems = listOf(
        Category(imageId = R.drawable.img_migros_sanal_market),
        Category(imageId = R.drawable.img_migros_hemen),
        Category(imageId = R.drawable.img_migros_yemek),
        Category(imageId = R.drawable.img_taze_direkt),
        Category(imageId = R.drawable.img_macro_online),
        Category(imageId = R.drawable.img_migros_ekstra),
        Category(imageId = R.drawable.img_migros_mion),
        Category(imageId = R.drawable.img_migros_muthis_cekilis)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        CategoriesCampaignBannerList(
            campaignImageList = campaignImageList
        )

        CategoriesSearchBar()

        CategoriesList(
            categoryItems = categoryItems
        )
    }
}

@Preview
@Composable
fun CategoriesScreenPreview() {
    CategoriesScreen()
}