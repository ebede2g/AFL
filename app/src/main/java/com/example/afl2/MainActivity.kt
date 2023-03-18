package com.example.afl2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afl2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val black_cat : Animal = Animal(R.drawable.black_cat,getString(R.string.animal_fullDescr1))
        val white_guse : Animal = Animal(R.drawable.white_guse,getString(R.string.animal_fullDescr2))
        val cool_bobr : Animal = Animal(R.drawable.cool_bobr,getString(R.string.animal_fullDescr3))

        bindingClass.button1.setOnClickListener {
            val h1 = Intent(this,DataCats::class.java)
            h1.putExtra("Animal",black_cat)
            startActivity(h1)
        }
        bindingClass.button2.setOnClickListener {
            val h2 = Intent(this,DataCats::class.java)
            h2.putExtra("Animal",white_guse)
            startActivity(h2)
        }
        bindingClass.button3.setOnClickListener {
            val h3 = Intent(this,DataCats::class.java)
            h3.putExtra("Animal",cool_bobr)
            startActivity(h3)
        }


    }





}