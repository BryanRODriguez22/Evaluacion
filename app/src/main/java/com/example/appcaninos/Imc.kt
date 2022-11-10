package com.example.appcaninos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imc.*


class Imc : AppCompatActivity(){
    fun OnCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        btn_cal_imc.setOnClickListener {
            try{

                var Peso = et_pesoCorporal.text.toString()
                var peso = Integer.parseInt(Peso)
                var Hsh = et_alturaHombro.text.toString()
                var hsh = Integer.parseInt(Hsh)
                var Ot = et_circunfePel.text.toString()
                var ot = Integer.parseInt(Ot)

                var nombre= et_nombre.text.toString()
                var raza = et_raza.text.toString()

                val enviar: Intent = Intent(this, Presentar::class.java)

                enviar.putExtra("peso", peso)
                enviar.putExtra("hsh", hsh)
                enviar.putExtra("ot", ot)
                enviar.putExtra("nombre", nombre)
                enviar.putExtra("raza", raza)

                startActivity(enviar)
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "Por favor llene el formulario",
                Toast.LENGTH_SHORT).show()

            }
        }

    }

}
