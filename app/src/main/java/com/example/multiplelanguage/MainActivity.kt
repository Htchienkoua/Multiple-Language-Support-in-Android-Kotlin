package com.example.multiplelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // the language support settins is done mainly in the strings.xml file
    //create all the string expressions in that file and add them successfully for every language
    //you wish to support from there
    lateinit var show : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show = findViewById(R.id.button)

        show.setOnClickListener {

            Toast.makeText(applicationContext, R.string.toast, Toast.LENGTH_LONG).show()
        }
    }
}