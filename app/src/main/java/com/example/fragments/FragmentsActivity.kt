package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class FragmentsActivity : AppCompatActivity() {

    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments)
        UI()
    }

    fun UI(){
        buttonOne= findViewById<Button>(R.id.firstSegment)
        buttonTwo = findViewById<Button>(R.id.secondSegment)

        buttonOne.setOnClickListener {

        }

        //
        buttonTwo.setOnClickListener {

        }
    }

    fun firstSegment(view: View) {

    }

    fun SecondSegment(view: View) {

    }


}