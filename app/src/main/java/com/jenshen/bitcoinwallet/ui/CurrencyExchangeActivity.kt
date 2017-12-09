package com.jenshen.bitcoinwallet.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import com.jenshen.bitcoinwallet.R


class CurrencyExchangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_exchange)
        findViewById<EditText>(R.id.from)
    }
}