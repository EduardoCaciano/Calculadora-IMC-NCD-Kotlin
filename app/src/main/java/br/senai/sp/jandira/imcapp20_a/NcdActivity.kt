package br.senai.sp.jandira.imcapp20_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val btnCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val edPeso: EditText = findViewById(R.id.ed_peso_ncd)
        val selecaoAtividade: Spinner = findViewById(R.id.selecao_atividades_fisicas)
        val selecaoIdade: Spinner = findViewById(R.id.selecao_idade)
        val radioMasculino: RadioButton = findViewById(R.id.button_radio_masculino)


        btnCalcular.setOnClickListener {

            if (edPeso.text.isEmpty()) {
                edPeso.error = "Você não me disse o seu peso!"
            }

            if (edPeso.text.isNotEmpty()){
                val peso: Double = edPeso.text.toString().toDouble()
                val nivelAtividade = selecaoAtividade.selectedItemPosition
                val faixaDeIdade = selecaoIdade.selectedItemPosition
                val intent = Intent(this, ResultadoNcdActivity::class.java)

                if (radioMasculino.isChecked()){
                    val sexo = 'm'
                    intent.putExtra("sexo", sexo)
                } else{
                    val sexo = 'f'
                    intent.putExtra("sexo", sexo)
                }

                intent.putExtra("peso", peso)
                intent.putExtra("nivelAtividade", nivelAtividade)
                intent.putExtra("faixaDeIdade", faixaDeIdade)
                startActivity(intent)
            }
        }
    }
}