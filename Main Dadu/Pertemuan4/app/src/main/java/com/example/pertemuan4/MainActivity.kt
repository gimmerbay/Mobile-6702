package com.example.pertemuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton1: Button = findViewById(R.id.btn_1)
        val rollButton2: Button = findViewById(R.id.btn_2)
        val jumlah: Button = findViewById(R.id.btn_jumlah)

        rollButton1.setOnClickListener {
            rollDice()
        }
        rollButton2.setOnClickListener {
            rollDice2()
        }
//        jumlah.setOnClickListener {
//            sumDice()
//        }
    }

    private fun rollDice2() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView1: TextView = findViewById(R.id.tv_2)
        resultTextView1.text = diceRoll.toString()
        val toast = Toast.makeText(this, "Dice 2 Rolled!!", Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView2: TextView = findViewById(R.id.tv_1)
        resultTextView2.text = diceRoll.toString()
        val toast = Toast.makeText(this, "Dice 1 Rolled!!", Toast.LENGTH_SHORT)
        toast.show()
    }

//    private fun sumDice() {
//        val angka1 = rollDice()
//        val angka2 = rollDice2()
//        var hasil: Int
//        hasil = angka1 + angka2
//
//        val penjumlahan:TextView = findViewById(R.id.tv_hasil)
//        penjumlahan.text  = hasil.toString()
//
//    }
}

//private operator fun Any.plus(angka2: Unit): Int {
//    TODO("Not yet implemented")
//}


class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}