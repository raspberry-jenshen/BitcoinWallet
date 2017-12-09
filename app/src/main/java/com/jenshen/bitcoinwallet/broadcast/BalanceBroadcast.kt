package com.jenshen.bitcoinwallet.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import com.jenshen.bitcoinwallet.utils.NotificationUtil

class BalanceBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val title = intent.getStringExtra("title")
        val balance = intent.getStringExtra("balance")
        NotificationUtil.sendDefaultNotification(context, title, balance)
    }
}
