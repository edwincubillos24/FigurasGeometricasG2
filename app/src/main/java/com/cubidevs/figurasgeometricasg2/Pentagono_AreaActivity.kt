package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_pentagono__area.*

class Pentagono_AreaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pentagono__area)
    }

    fun CalculoAreaPentagono(view:View){
        if (view is Button){
            when(view.id){
                R.id.CalcularAreaPentagono->{
                    tvResultadoAreaPent.text=((etPerimetroPent.text.toString().toDouble()*etApotemaPent.text.toString().toDouble())/2).toString()
                }
            }

        }

    }
}
