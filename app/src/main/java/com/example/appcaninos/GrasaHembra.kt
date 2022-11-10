package com.example.appcaninos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_grasa_hembra.*
import kotlinx.android.synthetic.main.activity_grasa_machos.*



class GrasaHembra : AppCompatActivity() {
    fun OnCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grasa_hembra)
        btn_cal_grasaMacho.setOnClickListener {
            try{
                var Peso = et_PesoHembra.text.toString()
                var peso = Integer.parseInt(Peso)
                var Hsh = et_AlturaHembra.text.toString()
                var hsh = Integer.parseInt(Hsh)
                var Cp = et_HembraCP.text.toString()
                var cp = Integer.parseInt(Cp)
                var nombre = et_nombreHembra.text.toString()
                var raza = et_hembra_raza.text.toString()

                val hembra: Intent = Intent(this, PresentaGrasa::class.java)

                hembra.putExtra("peso", peso)
                hembra.putExtra("hsh",hsh)
                hembra.putExtra("cp",cp)
                hembra.putExtra("nombre", nombre)
                hembra.putExtra("raza", raza)

                startActivity(hembra)

            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "Por favor llene el formulario",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }

}
