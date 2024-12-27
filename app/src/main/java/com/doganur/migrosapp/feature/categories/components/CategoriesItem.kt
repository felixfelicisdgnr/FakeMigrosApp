package com.doganur.migrosapp.feature.categories.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R
import com.doganur.migrosapp.ui.theme.AppTheme

@Composable
fun CategoriesItem(
    imageId: Int
) {
    Card(
        modifier = Modifier
            .width(140.dp)
            .height(93.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp,
            pressedElevation = 2.dp,
            focusedElevation = 1.dp,
            disabledElevation = 1.dp
        ),
        border = BorderStroke(
            width = 1.dp,
            color = Color.Black.copy(alpha = 0.3f)
        )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = imageId),
            contentDescription = stringResource(R.string.content_desc_img_category),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview
@Composable
fun CategoriesItemPreview() {
    AppTheme {
        CategoriesItem(
            imageId = R.drawable.img_migros_hemen
        )
    }
}