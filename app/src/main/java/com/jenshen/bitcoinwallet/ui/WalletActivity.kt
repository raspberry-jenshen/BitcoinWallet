package com.jenshen.bitcoinwallet.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jenshen.bitcoinwallet.R
import kotlinx.android.synthetic.main.activity_wallet.*

class WalletActivity : AppCompatActivity() {

    private var value = 345453;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        imageView.setOnClickListener {
            value ++
            value_text.text = "$value BTC"
        }
        currencyExchange.setOnClickListener { startActivity(Intent(this, CurrencyExchangeActivity::class.java)) }
    }
}