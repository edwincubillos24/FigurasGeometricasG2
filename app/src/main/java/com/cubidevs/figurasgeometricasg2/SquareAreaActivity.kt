package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_square_area.*

class SquareAreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_area)
    }


    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
    fun onButtonClicked(view: View) {
        if (view is Button) {
            when (view.getId()) {
                R.id.bncalcarea -> {

                    if( etsidea.text.toString().isNotBlank()  && etsidea.text.toString()!="." ){

                    var a = etsidea.text.toString().toDouble()
                    var area = a * a

                    tv_resultshowresult.text = area.toString()

                    }

                }
            }
        }
    }
}