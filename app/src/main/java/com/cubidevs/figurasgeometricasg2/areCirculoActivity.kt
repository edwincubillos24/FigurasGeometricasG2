package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_are_circulo.*

class areCirculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_are_circulo)

    }
    fun onButtonClicked(view: View){
        if(view is Button){
            when(view.id){
                R.id.bnCalcularAreaCirculo->{
                    tvResultAreaCirculo.text = (edRadioCircuiloArea.text.toString().toDouble() * 3.1416).toString()
                }
            }

        }
    }
}
