package ua.edu.lntu.cw3.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw3.R

// Set of Material typography styles to start with
val abril = FontFamily(Font(R.font.abril_fatface_regular))

val montserratregular = FontFamily(Font(R.font.montserrat_regular))

val montserratbold = FontFamily(Font(R.font.montserrat_bold))

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = montserratbold,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = montserratregular,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    displaySmall = TextStyle(
        fontFamily = abril,
        fontWeight = FontWeight.Normal,
        fontSize = 6.sp
    )

)