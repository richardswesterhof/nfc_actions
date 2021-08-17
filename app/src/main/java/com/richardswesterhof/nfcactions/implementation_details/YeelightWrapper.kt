package com.richardswesterhof.nfcactions.implementation_details

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mollin.yapi.YeelightDevice
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class YeelightWrapper: ViewModel() {

    fun toggleLight(ip: String, port: Int? = null) {
        // create a new coroutine to move the execution off the UI thread
        viewModelScope.launch(Dispatchers.IO) {
            val device = port?.let { YeelightDevice(ip, port) } ?: YeelightDevice(ip)
            device.toggle()
            Log.d("togglelight", "done")
        }
    }
}