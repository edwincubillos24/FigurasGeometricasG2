package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perimetro_pentegono.*

class PerimetroPentegonoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_pentegono)

        bnCalcular.setOnClickListener {
            var L = etLado.text.toString().toDouble()
            txPerimetro.text = (L * 5).toString()
        }

    }
}
