package com.cubidevs.figurasgeometricasg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_area_rombo.*

class AreaRomboActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_rombo)
        bnCalcular.setOnClickListener {
            var diagonalMayor = etDiagonalMayor.text.toString().toDouble()
            var diagonalMenor = etDiagonalMenor.text.toString().toDouble()
            var area = (diagonalMayor*diagonalMenor)/2

            tvResultado.text = area.toString()
        }
    }

}
