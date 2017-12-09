package com.jenshen.bitcoinhayter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.balance_info).setOnClickListener({
            val intent = Intent()
            intent.action = "com.show.balance"
            intent.putExtra("title", "Oops")
            intent.putExtra("balance", "Bitcoin fails :(")
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            sendBroadcast(intent)
        })
    }
}
