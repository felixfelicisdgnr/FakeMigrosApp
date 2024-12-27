package com.doganur.migrosapp.feature.categories

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R
import com.doganur.migrosapp.ui.theme.OrangeColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(

) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                            contentAlignment = Alignment.CenterEnd
                        ) {
                            Icon(
                                modifier = Modifier
                                    .height(25.dp)
                                    .align(Alignment.Center),
                                painter = painterResource(id = R.drawable.migros_title),
                                contentDescription = stringResource(R.string.content_desc_img_banner),
                                tint = OrangeColor
                            )

                            Box(
                                modifier = Modifier
                                    .size(29.dp)
                                    .border(
                                        width = 1.dp,
                                        color = Color.LightGray,
                                        shape = RoundedCornerShape(8.dp)
                                    )
                                    .align(Alignment.CenterEnd),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(23.dp),
                                    painter = painterResource(id = R.drawable.ic_notificationn),
                                    contentDescription = "Notification Icon",
                                    tint = Color.Black
                                )
                            }

                        }

                        HorizontalDivider(
                            modifier = Modifier
                                .fillMaxWidth(),
                            thickness = 1.dp,
                            color = Color.Black.copy(alpha = 0.1f)
                        )
                    }
                }
            )
        }) { paddingValues ->

        Surface(
            modifier = Modifier.padding(paddingValues)
        ) {
            CategoriesScreen()
        }
    }
}

@Preview
@Composable
fun AppScaffoldPreview() {
    AppScaffold()
}