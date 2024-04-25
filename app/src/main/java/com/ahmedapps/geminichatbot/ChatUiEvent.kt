package com.ahmedapps.geminichatbot

import android.graphics.Bitmap

/**
 * @author Amit Ranjan
 */
sealed class ChatUiEvent {
    data class UpdatePrompt(val newPrompt: String) : ChatUiEvent()
    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatUiEvent()
}
