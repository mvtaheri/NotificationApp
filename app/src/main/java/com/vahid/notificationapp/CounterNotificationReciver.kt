package com.vahid.notificationapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class CounterNotificationReciver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val service = CounterNotificationService(context)
        service.showNotification(++Counter.value)
    }
}