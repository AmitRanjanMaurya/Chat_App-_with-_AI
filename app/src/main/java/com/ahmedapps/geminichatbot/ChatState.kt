package com.ahmedapps.geminichatbot

import android.graphics.Bitmap
import com.ahmedapps.geminichatbot.data.Chat

/**
 * @author Amit Ranjan
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)