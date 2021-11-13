package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var e1: EditText
    lateinit var e2: EditText
    lateinit var e3: EditText
    lateinit var e4: EditText
    lateinit var e5: EditText
    lateinit var rg: RadioGroup
    lateinit var bt: Button
    lateinit var rb: RadioButton
    lateinit var ck:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        e1=findViewById(R.id.et3)
        e2=findViewById(R.id.et4)
        e3=findViewById(R.id.et5)
        e4=findViewById(R.id.et6)
        e5=findViewById(R.id.et7)
        rg=findViewById(R.id.rd1)
        bt=findViewById(R.id.bt3)
        ck=findViewById(R.id.c2)
        bt.setOnClickListener {
            val selectedOption: Int = rg!!.checkedRadioButtonId

            rb = findViewById(selectedOption)

            Toast.makeText(baseContext, "You selected "+rb.text, Toast.LENGTH_SHORT).show()

            if (ck.isChecked){
                Toast.makeText(baseContext, "You agreed to the terms and conditions", Toast.LENGTH_SHORT).show()
            }


    }
}}