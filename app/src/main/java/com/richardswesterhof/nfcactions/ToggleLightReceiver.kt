package com.richardswesterhof.nfcactions

import android.content.Context
import android.content.Intent
import android.util.Log
import com.mollin.yapi.YeelightDevice

private val listeningFors: List<String> = listOf("com.richardswesterhof.TOGGLE_LIGHT")

class ToggleLightReceiver: ExtendedBroadcastReceiver(listeningFors) {

    override fun trigger(context: Context, intent: Intent) {
        Log.d("debuginfo", "got to the broadcastreceiver")
        val devIP = "192.168.68.171"
        val device = YeelightDevice(devIP)
        device.toggle()

    }
}