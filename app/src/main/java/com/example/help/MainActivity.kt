package com.example.help

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btn_pd: Button
    private lateinit var btn_class: Button
    private lateinit var btn_field: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pd = findViewById(R.id.btn_pd)
        btn_class = findViewById(R.id.btn_class)
        btn_field = findViewById(R.id.btn_field)

        btn_pd.setOnClickListener {
            val intent = Intent(this, PeersonalDetails::class.java)
            startActivity(intent)

        }

        btn_class.setOnClickListener {
            val intent = Intent(this, Class::class.java)
            startActivity(intent)
        }

        btn_field.setOnClickListener {
            val intent = Intent(this, Field::class.java)
            startActivity(intent)
        }
    }
}