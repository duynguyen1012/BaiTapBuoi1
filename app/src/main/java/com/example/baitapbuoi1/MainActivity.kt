package com.example.baitapbuoi1
 // Thay bằng package name của bạn nếu khác

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AssignmentLayout()
                }
            }
        }
    }
}

@Composable
fun AssignmentLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Hàng 1: Block 1 (Xanh dương) - Block 2 (Đỏ) | Tỷ lệ 1:1
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            ColorBox(modifier = Modifier.weight(1f), text = "1", color = Color(0xFF2182F1))
            Spacer(modifier = Modifier.width(8.dp))
            ColorBox(modifier = Modifier.weight(1f), text = "2", color = Color(0xFFF34135))
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Hàng 2: Block 3 (Vàng) - Block 4 (Xanh lá) - Block 5 (Tím) | Tỷ lệ 1:1:2
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            ColorBox(modifier = Modifier.weight(1f), text = "3", color = Color(0xFFFFC000), textColor = Color.Black)
            Spacer(modifier = Modifier.width(8.dp))
            ColorBox(modifier = Modifier.weight(1f), text = "4", color = Color(0xFF4CAE50))
            Spacer(modifier = Modifier.width(8.dp))
            ColorBox(modifier = Modifier.weight(2f), text = "5", color = Color(0xFF8A2CE2))
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Hàng 3: Block 6 (Cam) | Full width
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            ColorBox(modifier = Modifier.weight(1f), text = "6", color = Color(0xFFFF9800))
        }

        // Phần text Họ tên - MSSV
        Box(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Nguyễn Đức Duy - BIT240080",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun ColorBox(modifier: Modifier, text: String, color: Color, textColor: Color = Color.White) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
    }
}