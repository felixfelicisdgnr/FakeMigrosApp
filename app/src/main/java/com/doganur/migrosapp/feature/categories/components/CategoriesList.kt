package com.doganur.migrosapp.feature.categories.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R
import com.doganur.migrosapp.feature.categories.model.Category
import com.doganur.migrosapp.ui.theme.AppTheme

@Composable
fun CategoriesList(
    categoryItems: List<Category>
) {
    LazyVerticalGrid(
        modifier = Modifier,
        columns = GridCells.Fixed(count = 2),
        horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
        verticalArrangement = Arrangement.spacedBy(space = 9.dp)
    ) {
        items(categoryItems) { category ->
            CategoriesItem(imageId = category.imageId)
        }
    }
}

@Preview
@Composable
fun CategoriesListPreview() {
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

    AppTheme {
        CategoriesList(categoryItems = categoryItems)
    }
}