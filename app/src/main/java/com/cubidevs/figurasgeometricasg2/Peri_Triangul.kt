package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_peri__triangul.*

class Peri_Triangul : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peri__triangul)

        BtnCalc.setOnClickListener(){
            var lad1 = vala.text.toString()
            var lad2 = valb.text.toString()
            var lad3 = valc.text.toString()
            var peri = 0.0

            peri = (lad1.toDouble()+lad2.toDouble()+lad3.toDouble())
            result.text = peri.toString() + " Unidades"

        }
    }
}
