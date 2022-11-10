package com.example.appcaninos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            val irA = Intent(this, Imc:: class.java)
            startActivity(irA)
        }
        btn_cal_macho.setOnClickListener {
            val irA = Intent(this, GrasaMacho :: class.java)
            startActivity(irA)
        }
        btn_cal_hembra.setOnClickListener {
            val irA = Intent(this, GrasaHembra :: class.java)
            startActivity(irA)
        }

    }
}