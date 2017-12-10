package com.jenshen.bitcoinwallet

import android.content.Context


class ApiManager(val context: Context) {
    private var pref: PrefManager = PrefManager(context);

    fun doLogin(email: CharSequence, password: CharSequence) {
        pref.saveAuthToken("This is a token")
        throw RuntimeException("OOps")
    }
}
