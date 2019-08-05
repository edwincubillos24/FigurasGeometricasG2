package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perimetro_rectangulo.*

class PerimetroRectanguloActivity : AppCompatActivity() {

    private var ladoauxa = 0
    private var ladoauxb = 0
    private var resultadoaux = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_rectangulo)

        boton.setOnClickListener{
            ladoauxa = ladoa.text.toString().toInt()
            ladoauxb = ladob.text.toString().toInt()

            resultadoaux = 2 * (ladoauxa + ladoauxb)

            tvresultado.text = resultadoaux.toString()
        }

    }
}
