package com.example.formview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.mButton)
        val mName = findViewById<EditText>(R.id.mName)
        val mTempat = findViewById<EditText>(R.id.mTempat)
        val mTanggal = findViewById<EditText>(R.id.mTanggal)

        button.setOnClickListener{
            val nama = mName.text.toString()
            val tempat = mTempat.text.toString()
            val tanggal = mTanggal.text.toString()

            Intent(this, ViewActivity::class.java).also {
                it.putExtra("EXTRA_NAMA", nama)
                it.putExtra("EXTRA_TEMPAT", tempat)
                it.putExtra("EXTRA_TANGGAL", tanggal)
                startActivity(it)
            }
        }
    }
}
