package com.example.implicitintentsea

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LetterDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_letter_description)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val letter = intent.getStringExtra("LETTER")
        val letterTextVeiw: TextView = findViewById(R.id.letterTextView)
        val letterDescritionTextView: TextView = findViewById(R.id.letterDescription)
        val backButton = findViewById<Button>(R.id.backButton)
        letterTextVeiw.text = letter

        letterDescritionTextView.text = when (letter) {
            "A" -> "A is for Apple"
            "B" -> "B is for Ball"
            "C" -> "C is for Cat"
            "D" -> "D is for Dog"
            "E" -> "E is for Elephant"
            //add description to the rest of the alphabests
            "Z" -> "Z is for Zebra"
            else -> "Letter not found"
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}