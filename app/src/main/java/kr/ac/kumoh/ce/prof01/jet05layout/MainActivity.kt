package kr.ac.kumoh.ce.prof01.jet05layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
                        BoxLayout()
                        Spacer(Modifier.size(50.dp))
                        ColumnLayout()
                        RowLayout()
                    }

                }
            }
        }
    }
}

@Composable
//fun ColumnScope.ColumnLayout() {
fun ColumnLayout() {
    Column(
        //modifier = Modifier.weight(1F),
        //verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Column 첫 번째",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFAA1803))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
        Text("Column 두 번째",
            modifier = Modifier
                .background(Color(0xFF6D8C00))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
        )
        Text("Column 세 번째",
            modifier = Modifier
                .background(Color(0xFFBD613C))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
        )
    }
}

@Composable
fun ColumnScope.RowLayout() {
    Row(
        modifier = Modifier
            .weight(1F)
            .fillMaxWidth()
            .background(Color(0xFFF1BAA1)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text("하나",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFAA1803))
                .padding(8.dp)
                .wrapContentHeight(Alignment.CenterVertically),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            //textAlign = TextAlign.Center,
        )
        Text("둘",
            modifier = Modifier
                .background(Color(0xFF6D8C00))
                .padding(8.dp),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            //textAlign = TextAlign.Center,
        )
        Text("셋",
            modifier = Modifier
                .width(150.dp)
                .background(Color(0xFFBD613C))
                .padding(8.dp),
            color = Color(0xFFF1BAA1),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "안드로이드 로고 배경",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "안드로이드 로고",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
        )
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = "체크 아이콘",
            tint = Color(0xFFAA1803),
            modifier = Modifier
                .size(50.dp)
                .offset((-50).dp, (-50).dp)
        )
    }
}