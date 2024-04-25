package com.ahmedapps.geminichatbot.data

import android.graphics.Bitmap

/**
 * @author Amit Ranjan
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)