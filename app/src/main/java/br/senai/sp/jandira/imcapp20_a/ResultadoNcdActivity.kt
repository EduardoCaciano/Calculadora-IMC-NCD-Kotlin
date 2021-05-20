package br.senai.sp.jandira.imcapp20_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val txtNcd: TextView = findViewById(R.id.text_view_ncd)
        val txtDica: TextView = findViewById(R.id.text_view_dica_ncd)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val idade = intent.getIntExtra("idade", 0)
        val nivelAtividade = intent.getIntExtra("nivelAtividade", 0)
        val sexo = intent.getCharExtra("sexo", 'm')

        val ncd = calcularNcd(peso, idade, nivelAtividade, sexo)

        txtNcd.text = String.format("%.1f", ncd)


        txtDica.text = getDicaDoDiaNcd()

    }
}