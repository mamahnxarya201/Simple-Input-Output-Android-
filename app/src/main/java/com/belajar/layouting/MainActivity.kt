package com.belajar.layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            Toast.makeText(this@MainActivity, "Input Terbaca", Toast.LENGTH_SHORT).show()
            msg1.text = "Hai," + edtNama.text + "!"
            msg2.text = "Nomor Telepon Kamu " + edtTelp.text
        }
    }
}
