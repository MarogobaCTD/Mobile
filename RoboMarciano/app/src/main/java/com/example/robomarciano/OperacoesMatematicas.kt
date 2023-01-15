package com.example.robomarciano

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class OperacoesMatematicas : AppCompatActivity() {
    val EXTRA_REPLY = "com.example.robomarciano.extra.REPLY";
    val EXTRA_MESSAGE = "com.example.robomarciano.extra.MESSAGE";
    val SOME = "some";
    val SUBTRAIA = "subtraia";
    val MULTIPLIQUE = "multiplique";
    val DIVIDA = "divida";
    val AGIR = "agir";
    private var mOper1: EditText? = null;
    private var mOper2: EditText? = null;
    var operacao = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacoes_matematicas)
        mOper1 = findViewById(R.id.editTextOper1);
        mOper2 = findViewById(R.id.editTextOper2);
        val mensagem = intent.getStringExtra(EXTRA_MESSAGE)!!
        operacao = mensagem.toString();
        val botao = findViewById<Button>(R.id.botaoCalculo);
        botao.setText(operacao);
    }

    fun calcular(view: View) {
        val Oper1 = mOper1?.getText().toString()
        val Oper2 = mOper2?.getText().toString()
        val avancado = MarcianoAvancado()
        val resposta = avancado.responda(operacao, Oper1.toDouble(), Oper2.toDouble())
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, resposta)
        setResult(RESULT_OK, replyIntent)
        finish()
    }


}