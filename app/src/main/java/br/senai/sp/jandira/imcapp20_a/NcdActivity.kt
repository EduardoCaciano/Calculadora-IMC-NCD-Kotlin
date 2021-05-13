package br.senai.sp.jandira.imcapp20_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val btnCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val edPeso: EditText = findViewById(R.id.ed_peso_ncd)

        btnCalcular.setOnClickListener {

            if (edPeso.text.isEmpty()) {
                edPeso.error = "Você não me disse o seu peso!"
            }

            if (edPeso.text.isNotEmpty()){
                val peso: Double = edPeso.text.toString().toDouble()

                val intent = Intent(this, ResultadoImcActivity::class.java)
                intent.putExtra("peso", peso)
                startActivity(intent)
            }
        }
    }
}