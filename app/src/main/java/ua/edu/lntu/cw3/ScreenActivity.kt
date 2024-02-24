package ua.edu.lntu.cw3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw3.data.progress

@Composable
fun progressListItem(
    process: progress,
    modifier: Modifier = Modifier
){

    Card (
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        modifier = modifier
    ) {
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ){
            Text(text = stringResource(process.days),
                style = MaterialTheme.typography.displayMedium,
                fontSize = 25.sp
            )
            Text(text = stringResource(id = process.nameres),
                style = MaterialTheme.typography.displayMedium,
                fontSize = 28.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier
                .fillMaxSize()
                .align(alignment = Alignment.CenterHorizontally)
            ){
                Image(painter = painterResource(id = process.imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier= Modifier
                        .fillMaxSize()
                        .align(alignment = Alignment.Center)
                        .clip(RoundedCornerShape(18.dp))

                )
            }
            Spacer(modifier = Modifier.height(10.dp))

        }
    }
}