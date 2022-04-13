package com.example.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etHeight:EditText = findViewById(R.id.etHeight)
        val etBodyMass:EditText = findViewById(R.id.etBodyMass)
        val btnCalculate:Button = findViewById(R.id.btnCalculate)
        val tvActualBMI:TextView = findViewById(R.id.tvActualBMI)
        val ivStatus:ImageView = findViewById(R.id.ivStatus)

        btnCalculate.setOnClickListener {
            val yourBmi = calculateBmi(etHeight.text.toString().toDouble(),etBodyMass.text.toString().toDouble())
            if (yourBmi < 25)
            {
                ivStatus.setImageResource(R.drawable.ic_eat)
            }
            else
            {
                ivStatus.setImageResource(R.drawable.ic_excercise)
            }
        }
    }

    fun calculateBmi(height:Double, mass:Double):Double
    {
        return mass/(height.pow(2))
    }

}

