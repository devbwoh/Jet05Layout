package kr.ac.kumoh.ce.prof01.jet05layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.ac.kumoh.ce.prof01.jet05layout.ui.theme.Jet05LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet05LayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ColumnLayout()
                        RowLayout()
                    }
                }
            }
        }
    }
}

@Composable
fun ColumnScope.ColumnLayout() {
    Column(
        modifier = Modifier.weight(1F),
        //verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Column 첫 번째",
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color(0xFFAA1803))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
        Text("Column 두 번째",
            modifier = Modifier
                .weight(1F)
                .background(Color(0xFF6D8C00))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
        )
        Text("Column 세 번째",
            modifier = Modifier
                .weight(1F)
                .background(Color(0xFFBD613C))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
        )
    }
}

@Composable
fun RowLayout() {
    Row {
        Text("하나",
            modifier = Modifier
                .weight(1F)
                .background(Color(0xFFAA1803))
                .padding(8.dp),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
        Text("둘",
            modifier = Modifier
                .weight(1F)
                .background(Color(0xFF6D8C00))
                .padding(8.dp),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
        Text("셋",
            modifier = Modifier
                .weight(1F)
                .background(Color(0xFFBD613C))
                .padding(8.dp),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
    }
}
