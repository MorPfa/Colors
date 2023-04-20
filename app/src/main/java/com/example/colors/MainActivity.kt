package com.example.colors

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val CREATE_BUTTON = findViewById<Button>(R.id.Create_button)
        CREATE_BUTTON.setOnClickListener{combineInputs()}
         }

 private fun combineInputs() {
        val BLUE_CHANNEL = findViewById<TextInputLayout>(R.id.Blue_Channel)
        val RED_CHANNEL = findViewById<TextInputLayout>(R.id.Red_Channel)
        val GREEN_CHANNEL = findViewById<TextInputLayout>(R.id.Green_Channel)


        val BLUE = BLUE_CHANNEL.editText?.text.toString()
        val RED = RED_CHANNEL.editText?.text.toString()
        val GREEN = GREEN_CHANNEL.editText?.text.toString()

        if(BLUE.isEmpty() or GREEN.isEmpty() or BLUE.isEmpty()) {
            Toast.makeText(this, "All Values are required", Toast.LENGTH_LONG).show()

        }
     else {

            val completeColorCode = "#$RED$GREEN$BLUE"
            val COLOR_DISPLAY = findViewById<TextView>(R.id.color_display)
            COLOR_DISPLAY.setBackgroundColor(Color.parseColor(completeColorCode))

        }
    }

}