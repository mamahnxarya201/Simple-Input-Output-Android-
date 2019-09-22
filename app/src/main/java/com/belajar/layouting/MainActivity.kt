package com.belajar.layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var genders = listOf("Laki-laki", "Perempuan")
    var genderIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        spkelamin.adapter = ArrayAdapter.createFromResource(this, R.array.jenis_kelamin)

        spkelamin.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, genders)

        spkelamin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               genderIndex = position
            }

        }

        btn1.setOnClickListener{
            Toast.makeText(this@MainActivity, "Input Terbaca", Toast.LENGTH_SHORT).show()
            msg1.text = "Hai, ${edtNama.text} Gender Saya ${genders[genderIndex]}!"
            msg2.text = "Nomor Telepon Saya ${edtTelp.text}"
        }
    }
}
