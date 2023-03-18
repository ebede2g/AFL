package com.example.afl2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afl2.databinding.ActivityDataCatsBinding
import com.example.afl2.databinding.ActivityMainBinding

class DataCats : AppCompatActivity() {
    lateinit var bindingClass : ActivityDataCatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityDataCatsBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val animal = intent.getParcelableExtra<Animal>("Animal")
        bindingClass.image1.setImageResource(animal!!.image)
        bindingClass.textDescr.text=animal.descr

        bindingClass.returnButton.setOnClickListener {
            finish()
        }
    }
}