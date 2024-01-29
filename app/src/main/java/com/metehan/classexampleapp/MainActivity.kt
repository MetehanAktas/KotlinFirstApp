package com.metehan.classexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    private lateinit var nameText:EditText
    private lateinit var ageText: EditText
    private lateinit var jobText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)
    }

    fun buttonClicked(view: View){
        val name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()

        myTextView.text = "Name: ${name} Age: ${age} job: ${job}"
    }




}