package com.example.birthdaycard

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greetings.*

class BirthdayGreetings : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetings)
        var name=intent.getStringExtra(NAME_EXTRA)
        Birthday_Activity_text.text="Happy Birthday $name"
    }
}