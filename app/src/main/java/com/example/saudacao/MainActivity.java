package com.example.saudacao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaudacao = (Button) findViewById(R.id.btnSaudacao);

    }

    public void btnSaudacaoClick(View v){
        AlertDialog.Builder diag = new AlertDialog.Builder(this);
        diag.setTitle("Saudação");
        diag.setMessage("Bem vindo ao aplicativo de saudação!");
        diag.setNeutralButton("OK", null);
        diag.show();
    }

}
