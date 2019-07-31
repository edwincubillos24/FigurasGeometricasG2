package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_area_triangulo.*

class AreaTrianguloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_triangulo)

        bnCalcular.setOnClickListener{
            var base = etbtriangulo.text.toString()
            var altura = ethtriangulo.text.toString()
            var divisor = 2.0
            var area = 0.0

            if(base.equals("")||(altura.equals(""))){
                area = 0.0
                Toast.makeText(this, "Ingrese Valores", Toast.LENGTH_SHORT).show()

            }else{
                area = (base.toDouble()*altura.toDouble())/divisor
            }

            var respuesta = area
            tvarea.text= respuesta.toString()

        }
    }
}
