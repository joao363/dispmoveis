package com.example.appsistemaempressarial_exer03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNumeroHrsTrabalhada;
    EditText edtValorHrsTrabalhada;
    Button btnCalcular;
    CheckBox cbDez;
    CheckBox cbQuinze;
    CheckBox cbVinte;
    EditText edtSalarioBruto;
    EditText edtDesconto;
    EditText edtSalarioLiquido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumeroHrsTrabalhada = (EditText) findViewById(R.id.edtNumeroHrsTrabalhada);
        edtValorHrsTrabalhada = (EditText) findViewById(R.id.edtValorHrsTrabalhada);
        cbDez = (CheckBox) findViewById(R.id.cbDez);
        cbQuinze = (CheckBox) findViewById(R.id. cbQuinze);
        cbDez    = (CheckBox) findViewById(R.id.cbDez);
        btnCalcular    = (Button) findViewById(R.id.btnCalcular);
        edtSalarioBruto = (EditText) findViewById(R.id.edtSalarioBruto);
        edtDesconto = (EditText) findViewById(R.id.edtDesconto);
        edtSalarioLiquido = (EditText) findViewById(R.id.edtSalarioLiquido);
    }

    public void btnCalcular(View v){

        if (edtNumeroHrsTrabalhada.getText().length() > 0 && edtValorHrsTrabalhada.getText().length() >0 ){

            double hrs = Double.parseDouble(edtNumeroHrsTrabalhada.getText().toString());
            double valor = Double.parseDouble(edtValorHrsTrabalhada.getText().toString());

            double liquido = 0.0;
            double bruto = 0.0;
            double desconto = 0.0;
            double ValorDescontar = 0.0;

            if(cbDez.isChecked()){
                bruto = hrs * valor;
                desconto = bruto / 10;
                ValorDescontar = desconto ;
                liquido = bruto - ValorDescontar;
                edtSalarioBruto.setText(""+bruto);
                edtDesconto.setText(""+ValorDescontar);
                edtSalarioLiquido.setText(""+liquido);
            }
            if(cbQuinze.isChecked()){
                bruto = hrs * valor;
                desconto = bruto / 15;
                ValorDescontar = desconto ;
                liquido = bruto - ValorDescontar;
                edtSalarioBruto.setText(""+bruto);
                edtDesconto.setText(""+ValorDescontar);
                edtSalarioLiquido.setText(""+liquido);
            }
            if(cbQuinze.isChecked()){
                bruto = hrs * valor;
                desconto = bruto / 20;
                ValorDescontar = desconto ;
                liquido = bruto - ValorDescontar;
                edtSalarioBruto.setText(""+bruto);
                edtDesconto.setText(""+ValorDescontar);
                edtSalarioLiquido.setText(""+liquido);
            }



        } else {
            AlertDialog.Builder diag = new AlertDialog.Builder((this));
            diag.setTitle("Erro!!!");
            diag.setNeutralButton("OK", null);
            diag.show();
        }

    }
}
