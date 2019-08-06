package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area_rectangulo.*

class AreaRectanguloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_rectangulo)

        bnarearect.setOnClickListener {
            val base = etbase.text.toString().toInt()
            val altura = etaltura.text.toString().toInt()
            val area = base * altura
            tvarea.text = area.toString()


        }

    }
}