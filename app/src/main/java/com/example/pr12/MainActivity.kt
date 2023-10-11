package com.example.pr12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)


        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)

        val CheckBox1= findViewById<CheckBox>(R.id.checkBox1)
        val CheckBox2= findViewById<CheckBox>(R.id.checkBox2)
        val CheckBox3= findViewById<CheckBox>(R.id.checkBox3)

        radioButton1.setOnClickListener {
            imageView1.setImageResource(R.drawable.xomayk)
        }
        radioButton2.setOnClickListener {
            imageView1.setImageResource(R.drawable.fish)
        }
        radioButton3.setOnClickListener {
            imageView1.setImageResource(R.drawable.dog30)
        }

        CheckBox1.setOnClickListener{
            if (CheckBox1.isChecked){
                imageView2.setVisibility(View.VISIBLE)
            }
            else { imageView2.setVisibility(View.INVISIBLE)}
        }
        CheckBox2.setOnClickListener{
            if (CheckBox2.isChecked){
                imageView3.setVisibility(View.VISIBLE)
            }
            else { imageView3.setVisibility(View.INVISIBLE)}
        }
        CheckBox3.setOnClickListener{
            if (CheckBox3.isChecked){
                imageView4.setVisibility(View.VISIBLE)
            }
            else { imageView4.setVisibility(View.INVISIBLE)}
        }

    }
}