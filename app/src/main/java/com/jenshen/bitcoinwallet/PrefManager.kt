package com.jenshen.bitcoinwallet


import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

import com.jenshen.bitcoinwallet.utils.CryptoClass

class PrefManager(context: Context) {
    private val preferences: SharedPreferences = context.getSharedPreferences("wallet_pref", Activity.MODE_PRIVATE)
    private val crypt: CryptoClass = CryptoClass()

    val token: String?
        get() {
            try {
                return crypt.aesDeccryptedString(preferences.getString(KEY_TOKEN, null))
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return null
        }

    fun saveAuthToken(token: String) {
        val editor = preferences.edit()
        try {
            val superSecurePassword = crypt.aesEncryptedString(token)
            editor.putString(KEY_TOKEN, superSecurePassword)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        editor.apply()
    }

    companion object {
        private val KEY_TOKEN = "token"
    }
}
