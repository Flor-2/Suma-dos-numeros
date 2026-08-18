package com.example.suma1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumero1: EditText
    private lateinit var edtNumero2: EditText
    private lateinit var btnSumar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener {

            val texto1 = edtNumero1.text.toString()
            val texto2 = edtNumero2.text.toString()

            if (texto1.isEmpty() || texto2.isEmpty()) {
                txtResultado.text = "Ingrese ambos números"
                return@setOnClickListener
            }

            val num1 = texto1.toInt()
            val num2 = texto2.toInt()

            val resultado = num1 + num2

            txtResultado.text = "Resultado: $resultado"
        }
    }
}