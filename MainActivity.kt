package com.saarthi.ap

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "SAARTHI AP v0.6\n\nनमस्कार! मैं SAARTHI AP हूँ।\n\nMultilingual voice + text AI assistant\n\nVersion 0.6"
            textSize = 22f
            setPadding(40, 60, 40, 40)
        }
        setContentView(text)
    }
}
