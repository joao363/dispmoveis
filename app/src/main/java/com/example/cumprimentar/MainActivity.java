package com.example.cumprimentar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    EditText edtSobrenome;

    Button btnCumprimentar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtSobrenome = (EditText) findViewById(R.id.edtSobrenome);

        btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);
    }

    public void btnCumprimentarClick (View v){
        String nome = edtNome.getText().toString();
        String sobrenome = edtSobrenome.getText().toString();
        AlertDialog.Builder diag = new AlertDialog.Builder(this);
        diag.setTitle("Bem vindo!");
        diag.setMessage("Boa noite " + nome  +" " +  sobrenome + " !");
        diag.setNeutralButton("OK", null);
        diag.show();
    }

}
