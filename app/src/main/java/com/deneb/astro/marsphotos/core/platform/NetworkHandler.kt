package com.deneb.astro.marsphotos.core.platform

import android.content.Context
import com.deneb.astro.marsphotos.core.extensions.checkNetworkState


class NetworkHandler
(private val context: Context) {
    val isConnected get() = context.checkNetworkState()
}