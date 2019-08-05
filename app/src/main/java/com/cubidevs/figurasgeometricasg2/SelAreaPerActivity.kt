package com.cubidevs.figurasgeometricasg2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SelAreaPerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sel_area_per)
    }

    fun onButtonClicked(view: View) {
        val figurarecibida = intent.extras
        val data = figurarecibida!!.getInt("figura")
        if (view is Button) {
            if (view.getId()==R.id.bnArea){
                when (data){
                    0 -> {
                        val intent = Intent(this,AreaTrianguloActivity::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(this,SquareAreaActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {

                    }
                    3 -> {
                        val intent = Intent(this,areCirculoActivity::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(this,AreaRomboActivity::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent = Intent(this,Pentagono_AreaActivity::class.java)
                        startActivity(intent)

                    }
                    6 -> {

                    }
                }
            }
            if (view.getId()==R.id.bnPerimetro) {
                when (data) {
                    0 -> {

                    }
                    1 -> {
                        val intentSquarePerimeter = Intent(this,SquarePerimeterActivity::class.java)
                        startActivity(intentSquarePerimeter)
                    }
                    2 -> {
                        val intent = Intent(this,PerimetroRectanguloActivity::class.java)
                        startActivity(intent)

                    }
                    3 -> {

                    }
                    4 -> {

                        val intent = Intent(this,PerimetroRomboActivity::class.java)
                        startActivity(intent)

                    }
                    5 -> {

                    }
                    6 -> {

                    }
                }
            }
        }
    }
}

