package com.doganur.migrosapp.feature.categories.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R
import com.doganur.migrosapp.feature.categories.model.Banner
import com.doganur.migrosapp.ui.theme.AppTheme

@Composable
fun CategoriesCampaignBannerList(
    campaignImageList: List<Banner>,
    startIndex: Int = 0
) {
    val lazyListState = rememberLazyListState(startIndex)
    val isScrollInProgress = lazyListState.isScrollInProgress

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .clip(shape = RoundedCornerShape(8.dp)),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        itemsIndexed(campaignImageList) { index, banner ->
            CategoriesCampaignBannerItem(
                bannerImage = banner.imageId,
                imageIndex = index,
                listSize = campaignImageList.size
            )
        }
    }
}

@Preview
@Composable
fun CategoriesCampaignBannerListPreview() {
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

    AppTheme {
        CategoriesCampaignBannerList(
            campaignImageList = campaignImageList
        )
    }
}