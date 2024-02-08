package com.example.tarasov7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById(R.id.button_count)
        var textView: TextView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        button.setOnClickListener{
            textView.text = "Hello, friend!"
        }
        imageButton.setOnClickListener{
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }
    }
}