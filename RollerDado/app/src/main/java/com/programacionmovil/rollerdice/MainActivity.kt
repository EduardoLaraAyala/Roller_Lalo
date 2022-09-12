package com.programacionmovil.rollerdice

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnTirar : Button
    lateinit var dado1: ImageView
    lateinit var dado2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTirar = findViewById(R.id.btnTirar)
        dado1 = findViewById(R.id.dado1)
        dado2 = findViewById(R.id.dado2)
        btnTirar.setOnClickListener(){
            Toast.makeText(applicationContext, "Tirando", Toast.LENGTH_SHORT).show()
            dado1.setImageDrawable(getRandomDiceImage())
            dado2.setImageDrawable(getRandomDiceImage())

        }
    }

    private fun getRandomDiceImage() : Drawable {
        val numeroAle = aleatorio()
        var numeroDado : Drawable
        when(numeroAle) {
            1 -> {
                numeroDado = getDrawable(R.drawable.dice_1)!!
            }
            2 -> {
                numeroDado = getDrawable(R.drawable.dice_2)!!
            }
            3 -> {
                numeroDado = getDrawable(R.drawable.dice_3)!!
            }
            4 -> {
                numeroDado = getDrawable(R.drawable.dice_4)!!
            }
            5 -> {
                numeroDado = getDrawable(R.drawable.dice_5)!!
            }
            6 -> {
                numeroDado = getDrawable(R.drawable.dice_6)!!
            }
            else -> {
                numeroDado= getDrawable(R.drawable.empty_dice)!!
            }
        }
        return numeroDado
    }

    fun aleatorio(): Int{
        return (1..6).random()
    }
}