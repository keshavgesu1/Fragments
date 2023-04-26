package com.example.fragments

import android.R.attr.fragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

// Also use scope fun in this repo
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
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.frameLayout, FragmentOne())
        transaction.commit()
    }

    fun SecondSegment(view: View) {

        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.frameLayout, FragmentSecond())
        transaction.commit()

    }


}