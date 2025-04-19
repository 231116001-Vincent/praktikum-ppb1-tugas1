package com.vharya.tugas1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSubmit = findViewById<Button>(R.id.button_submit)
        val resultView = findViewById<TextView>(R.id.result_view)

        buttonSubmit.setOnClickListener {
            val inputName = findViewById<EditText>(R.id.input_name)
            val inputAddress = findViewById<EditText>(R.id.input_address)
            val inputPhone = findViewById<EditText>(R.id.input_phone)
            val inputEmail = findViewById<EditText>(R.id.input_email)
            val inputDescription = findViewById<EditText>(R.id.input_description)
            val inputExperience = findViewById<EditText>(R.id.input_experience)
            val inputEducation = findViewById<EditText>(R.id.input_education)
            val inputSkill = findViewById<EditText>(R.id.input_skill)

            var result = ""

            result += "Name\n${inputName.text}\n\n"
            result += "Address\n${inputAddress.text}\n\n"
            result += "Phone\n${inputPhone.text}\n\n"
            result += "Email\n${inputEmail.text}\n\n"
            result += "Description\n${inputDescription.text}\n\n"
            result += "Experience\n${inputExperience.text}\n\n"
            result += "Education\n${inputEducation.text}\n\n"
            result += "Skill\n${inputSkill.text}\n\n"

            resultView.text = result
        }
    }
}