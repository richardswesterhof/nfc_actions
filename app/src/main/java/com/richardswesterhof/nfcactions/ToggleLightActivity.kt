package com.richardswesterhof.nfcactions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ToggleLightActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveTaskToBack(true)
        setContentView(R.layout.activity_toggle_light)
        Log.d("togglelight", "started toggle light activity")

        Intent(this, ToggleLightReceiver::class.java).also { intent ->
            intent.action = "com.richardswesterhof.TOGGLE_LIGHT"
            intent.putExtra("data", "Nothing to see here, move along.")
            sendBroadcast(intent)
        }

        finishAndRemoveTask()
    }
}