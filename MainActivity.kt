 package com.saarthi.ap

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "नमस्कार! SAARTHI AP v0.6"
        textView.textSize = 24f
        textView.setPadding(40, 60, 40, 40)

        setContentView(textView)
    }
}
