package com.richardswesterhof.nfcactions

import android.content.Context
import android.content.Intent
import android.util.Log
import com.richardswesterhof.nfcactions.implementation_details.YeelightWrapper

private val listeningFors: List<String> = listOf("com.richardswesterhof.TOGGLE_LIGHT")

class ToggleLightReceiver: ExtendedBroadcastReceiver(listeningFors) {

    override fun trigger(context: Context, intent: Intent) {
        Log.d("togglelight", "got to the broadcastreceiver")
        val devIP = "192.168.68.171"
        val devPort = null
        val yl = YeelightWrapper()
        yl.toggleLight(devIP, devPort)
    }
}