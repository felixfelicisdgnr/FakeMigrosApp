package com.doganur.migrosapp.feature.categories.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doganur.migrosapp.R

@Composable
fun CategoriesCampaignBannerItem(
    bannerImage: Int,
    imageIndex: Int,
    listSize: Int
) {
    Box(
        modifier = Modifier
            .width(380.dp)
            .height(120.dp)
            .clip(shape = RoundedCornerShape(8.dp))
    ) {
        Image(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxSize(),
            painter = painterResource(bannerImage),
            contentDescription = stringResource(R.string.content_desc_img_banner),
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .width(70.dp)
                .padding(all = 8.dp)
                .clip(shape = RoundedCornerShape(7.dp))
                .background(color = Color.Black.copy(alpha = 0.4f))
                .align(Alignment.BottomEnd),
            text = "${imageIndex + 1} / ${listSize + 1}",
            color = Color.White,
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun CategoriesCampaignItemPreview() {
    CategoriesCampaignBannerItem(
        bannerImage = R.drawable.migros_firsat,
        imageIndex = 0,
        listSize = 12
    )
}