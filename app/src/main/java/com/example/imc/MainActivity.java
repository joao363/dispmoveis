package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso;
    EditText edtAltura;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso = (EditText) findViewById(R.id.edtPeso);
        edtAltura = (EditText) findViewById(R.id.edtAltura);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

    }

    public void btnCalcularClick (View v){
        if (edtPeso.getText().length() > 0 && edtAltura.getText().length() > 0){

            double n1 = Double.parseDouble(edtPeso.getText().toString());
            double n2 = Double.parseDouble(edtAltura.getText().toString());

            double imc = (n1 / (n2*n2));

            if(imc < 18.5){
                Intent intent = new Intent(this, Situacao.class);
                startActivity(intent);

            }else if(imc > 18.5 && imc < 24.9){
                Intent intent = new Intent(this, PesoNormal.class);
                startActivity(intent);
            }else if(imc > 25 && imc < 29.9){
                Intent intent = new Intent(this, SobrePeso.class);
                startActivity(intent);
            }else if(imc > 30 && imc < 34.9){
                Intent intent = new Intent(this, Obesidade1.class);
                startActivity(intent);
            }else if(imc > 35 && imc < 39.9){
                Intent intent = new Intent(this, Obesidade2.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, Obesidade3.class);
                startActivity(intent);
            }
        }
    }
}
