package ua.edu.lntu.cw3.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class progress(
    @StringRes val days:Int,
    @StringRes val nameres:Int,
    @DrawableRes val imageRes:Int,
    @StringRes val descriptionres:Int
)