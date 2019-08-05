package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perimetro_rombo.*

class PerimetroRomboActivity : AppCompatActivity() {

    private var lado_A:Int = 0
    private var resultado:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_rombo)

        btCalcular.setOnClickListener {
            lado_A = etValorA.text.toString().toInt()
            resultado= 4*lado_A
            tvResultado.text = "Perímetro = " + resultado.toString()+ "m"

        }

    }


}

