package com.jenshen.bitcoinwallet.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jenshen.bitcoinwallet.ApiManager
import com.jenshen.bitcoinwallet.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private val apiManager: ApiManager = ApiManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        imageView.setOnClickListener { startActivity(Intent(this, WalletActivity::class.java)) }
        login.setOnClickListener {
            if (doLogin(password.text.toString(), email.text.toString())) {
                startActivity(Intent(this, WalletActivity::class.java))
            }
        }
    }

    private fun doLogin(email: CharSequence, password: CharSequence): Boolean {
        return try {
            apiManager.doLogin(email, password)
            true
        } catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            false
        }
    }
}
