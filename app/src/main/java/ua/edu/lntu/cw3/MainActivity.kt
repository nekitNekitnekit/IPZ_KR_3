package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw3.data.ProgressRepository
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CR_3()
                }
            }
        }
    }
}

@Composable
fun CR_3(){
    Scaffold (modifier = Modifier.fillMaxSize(),
        topBar = {Topappbar()}
    ) {
        val progress = ProgressRepository.progresses
        progresslist(progress = progress, contentPadding = it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topappbar(modifier: Modifier=Modifier){
    CenterAlignedTopAppBar(title = {
        Text(text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.displayLarge,
            fontSize = 30.sp
        )
    },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CR_3Theme {
        CR_3()
    }
}