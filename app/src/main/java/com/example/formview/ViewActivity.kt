package com.example.formview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val msg_nama = intent.getStringExtra("EXTRA_NAMA")
        val msg_tempat = intent.getStringExtra("EXTRA_TEMPAT")
        val msg_tanggal = intent.getStringExtra("EXTRA_TANGGAL")


        val nama = findViewById<TextView>(R.id.textView3).apply {
            text = msg_nama
        }
        val tempat = findViewById<TextView>(R.id.textView5).apply {
            text = msg_tempat
        }
        val tanggal = findViewById<TextView>(R.id.textView10).apply {
            text = msg_tanggal
        }

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            finish()
        }
    }
}