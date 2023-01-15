package com.example.robomarciano

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.java.simpleName;
    val EXTRA_MESSAGE = "com.example.robomarciano.extra.MESSAGE";
    private var mMensagemRobo: EditText? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMensagemRobo = findViewById(R.id.editText_main);

    }

    fun chamarRobo(view: View) {
        val intent = Intent(this, robo_response::class.java);
        val message: String = mMensagemRobo?.getText().toString()
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        mMensagemRobo?.text?.clear();
    }
}