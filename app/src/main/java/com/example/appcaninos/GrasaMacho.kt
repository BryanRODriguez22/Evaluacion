package com.example.appcaninos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_grasa_machos.*
import kotlinx.android.synthetic.main.activity_imc.btn_cal_imc

class GrasaMacho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grasa_machos)

        btn_cal_grasaMacho.setOnClickListener {
            try{
                var Peso = et_GrasaPesoMacho.text.toString()
                var peso = Integer.parseInt(Peso)
                var Hsh = et_Grasahsh.text.toString()
                var hsh = Integer.parseInt(Hsh)
                var Cp = et_GrasaCp.text.toString()
                var cp = Integer.parseInt(Cp)
                var nombre = et_GrasaNombre.text.toString()
                var raza = et_GrasaRaza.text.toString()

                val datos: Intent = Intent(this, PresentaGrasa::class.java)

                datos.putExtra("peso", peso)
                datos.putExtra("hsh",hsh)
                datos.putExtra("cp",cp)
                datos.putExtra("nombre", nombre)
                datos.putExtra("raza", raza)

                startActivity(datos)

            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "Por favor llene el formulario",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }
}
