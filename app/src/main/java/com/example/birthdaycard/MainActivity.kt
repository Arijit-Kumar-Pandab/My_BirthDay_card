package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var name = editTextTextPersonName.editableText.toString()
            Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, BirthdayGreetings::class.java)
            intent.putExtra(BirthdayGreetings.NAME_EXTRA,name )
            startActivity(intent)
        }
    }

}