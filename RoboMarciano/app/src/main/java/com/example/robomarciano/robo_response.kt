package com.example.robomarciano

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class robo_response : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.java.simpleName;
    val EXTRA_MESSAGE = "com.example.robomarciano.extra.MESSAGE";
    val SOME = "some";
    val SUBTRAIA = "subtraia";
    val MULTIPLIQUE = "multiplique";
    val DIVIDA = "divida";
    val AGIR = "agir";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robo_response)
        var resposta = ""
        val intent = intent;
        val mensagem = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView_mensagem)
        val acao = MarcianoAcao()

        if (mensagem.toString().indexOf(SOME) == 0 || mensagem.toString().indexOf(SUBTRAIA) == 0 ||
            mensagem.toString().indexOf(MULTIPLIQUE) == 0 || mensagem.toString().indexOf(DIVIDA) == 0
        ) {
            val delim = " "
            val list = mensagem.toString().split(delim)
            val operacao = list[0]
            val oper1 = list[1]
            val oper2 = list[2]
            if (isNumber(oper1.toString()) && isNumber(oper2.toString())) {
                val avancado = MarcianoAvancado()
                resposta = avancado.responda(operacao, oper1.toDouble(), oper2.toDouble())
            } else {
                resposta = "Operadores inválidos!"
            }
        } else if (mensagem.toString().indexOf(AGIR) == 0) {
            val premium = MarcianoPremium(acao)
            resposta = premium.responda(mensagem.toString())
        } else {
            val basico = Marciano()
            resposta = basico.responda(mensagem.toString())
        }
        textView.text = resposta
    }

    fun voltar(view: View) {
        finish()
    }

    fun isNumber(s: String): Boolean {
        return try {
            s.toInt()
            true
        } catch (ex: NumberFormatException) {
            false
        }
    }

}