package com.example.triviaactivity13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.et_name)
        val btnStart: Button = findViewById(R.id.btn_start)

        btnStart.setOnClickListener {
            val name = etName.text.toString().trim()


            if (name.isEmpty()) {

                Toast.makeText(this, "Por favor ingrese su nombre", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }
        }
    }
}
