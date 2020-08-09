package com.example.methoden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var klasse = 1
    var zahl1 = 0
    var zahl2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textfeld.text = berechne(Integer.parseInt(editZahl1.text.toString()), Integer.parseInt(editZahl2.text.toString()))
        }
    }

    fun berechne(zahl1 : Int, zahl2: Int) : String {
        var ergebnis = zahl1 + zahl2
        return ergebnis.toString()
    }
}