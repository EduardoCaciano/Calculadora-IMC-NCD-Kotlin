package br.senai.sp.jandira.imcapp20_a.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.senai.sp.jandira.imcapp20_a.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var editUser: EditText
    lateinit var editPassword: EditText
    lateinit var btnLogin: Button
    lateinit var tvMensagemErro: TextView
    lateinit var tvCrieSuaConta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)
        val lembrar = dados.getBoolean("lembrar", false)

        if (lembrar == true){
            abrirDashBoard()
        }

        editUser = findViewById(R.id.email)
        editPassword = findViewById(R.id.senha)
        btnLogin = findViewById(R.id.login)
        tvMensagemErro = findViewById(R.id.tv_mensagem_erro)
        tvCrieSuaConta = findViewById(R.id.tv_crie_sua_conta)

        tvCrieSuaConta.setOnClickListener {
            val intent = Intent(this, NovoUsuarioActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            login()
        }
    }

    private fun abrirDashBoard() {
        val intent = Intent(this, DashBoardActivity::class.java)
        startActivity(intent)
        finish()
    }

    private  fun login() {
//        emai: user@email.com
//        senha: 123

        val user = editUser.text.toString()
        val pass = editPassword.text.toString()

        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)

        val userPreferences = dados.getString("email", "Não encontrado")
        val passPreferences = dados.getString("senha", "Não encontrado")

        if (user == userPreferences && pass == passPreferences){
            // Armazenar os dados no usuário no SharedPreferences
            val intent = Intent(this, DashBoardActivity::class.java)

            //Gravar e lembrar do SharedPreferences
            val editor = dados.edit()
            editor.putBoolean("lembrar", button_lembrar_senha.isChecked)
            editor.apply()

            startActivity(intent)
            finish()
        } else {
            tvMensagemErro.text = "Usuário ou senha incorretos!!!"
        }
    }
}