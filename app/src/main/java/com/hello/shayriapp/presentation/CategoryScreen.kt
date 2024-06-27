package com.hello.shayriapp.presentation

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.hello.shayriapp.ui.theme.primaryColor
import com.hello.shayriapp.ui.theme.primaryLight


@Composable
fun CategoryScreen(navHostController: NavHostController) {
    val context = LocalContext.current

    // Handle back press
    BackHandler {
        // Exit the app
        (context as? android.app.Activity)?.finish()
    }

    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryColor)
        ) {
            Column {
                MainToolbar(title = "Category") { TODO() }

                LazyColumn {
                    items(getList()) { item ->
                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(85.dp)
                                .padding(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = primaryLight
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = item.title.toString(),
                                    style = TextStyle(
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp, color = Color.White
                                    )
                                )
                            }
                        }
                    }
                }
            }


        }
    }
}
