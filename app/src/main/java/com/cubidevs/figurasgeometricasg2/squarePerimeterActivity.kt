package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import kotlinx.android.synthetic.main.activity_square_perimeter.*
import java.lang.Exception

class squarePerimeterActivity : AppCompatActivity() {
    //var reseivedData=intent.extras
    private var r=0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_perimeter)
    }

    fun solveSquarePerimeter(view: View){
        if (view is Button){

            try {
                var a=et_square_side_ego2509.text.toString().toFloat()
                r=4*a
                tx_outp_square_perim_ego2509.text=r.toString()
            }
            catch (e:Exception){

            }

        }
    }

}
