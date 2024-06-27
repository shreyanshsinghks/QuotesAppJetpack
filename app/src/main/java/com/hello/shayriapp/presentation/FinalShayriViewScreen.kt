package com.hello.shayriapp.presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hello.shayriapp.R
import com.hello.shayriapp.ui.theme.primaryColor
import com.hello.shayriapp.ui.theme.primaryLight

@Composable
fun FinalShayriViewScreen(navHostController: NavHostController, item: String?) {
    Surface {
        val context = LocalContext.current
        val clipboardManager: ClipboardManager = LocalClipboardManager.current

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(150.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = primaryLight.copy(0.7f)
                    ),
                    border = BorderStroke(width = 2.dp, color = Color.White.copy(0.6f))
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            text = item!!,
                            color = Color.White,
                            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Card(
                        modifier = Modifier
                            .size(55.dp, 40.dp)
                            .clickable {
                                val sendIntent: Intent = Intent().apply {
                                    action = Intent.ACTION_SEND
                                    putExtra(Intent.EXTRA_TEXT, item)
                                    type = "text/plain"
                                }
                                val shareIntent = Intent.createChooser(sendIntent, null)
                                context.startActivity(shareIntent)
                            }
                        ,
                        colors = CardDefaults.cardColors(
                            containerColor = primaryLight.copy(0.7f)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_share),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .size(55.dp, 40.dp)
                            .clickable {
                                clipboardManager.setText(
                                    AnnotatedString(item!!)
                                )
                                Toast
                                    .makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT)
                                    .show()
                            }
                        ,
                        colors = CardDefaults.cardColors(
                            containerColor = primaryLight.copy(0.7f)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_copy),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun FinalViewPreview() {
    FinalShayriViewScreen(
        navHostController = rememberNavController(),
        item = "Everything is fair in love and war."
    )
}