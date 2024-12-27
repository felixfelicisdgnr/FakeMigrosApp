package com.doganur.migrosapp.feature.categories.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doganur.migrosapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesSearchBar() {
    var query by remember { mutableStateOf("") }
    var isActive by remember { mutableStateOf(false) }

    SearchBar(
        modifier = Modifier
            .fillMaxWidth(),
        query = query,
        onQueryChange = { query = it },
        onSearch = { },
        active = isActive,
        shape = RoundedCornerShape(12.dp),
        onActiveChange = { isActive = it },
        placeholder = { Text("Ürün, yemek veya hizmet ara") },
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "Search Icon")
        },
        trailingIcon = {
            IconButton(onClick = { query = "" }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_microfon),
                    contentDescription = "Clear Search",
                    tint = Color.Black
                )
            }
        }
    ) {

    }
}

@Preview
@Composable
fun CategoriesSearchBarPreview() {
    CategoriesSearchBar()
}
