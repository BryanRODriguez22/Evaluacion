package com.example.appcaninos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_presentar.*

class Presentar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentar)

        val extras = intent.extras
        val peso = extras?.getString("peso") ?: 0
        val hsh = extras?.getInt("hsh") ?: 0
        val ot = extras?.getInt("ot") ?: 0
        val nombre = extras?.getString("nombre") ?: "sin nombre"
        val raza = extras?.getString("raza") ?: "sin raza"

        tv_IMCnombre.setText("El IMC de $nombre es: " )

        var cal1 = 0
        var imc = 0

        cal1 = hsh*ot
        imc = peso /


    }
}