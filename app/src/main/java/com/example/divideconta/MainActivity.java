package com.example.divideconta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edtConsumoTotal;
    EditText edtCouvert;
    EditText edtCustoTotal;
    EditText edtValorPessoa;

    RadioGroup rgTaxa;
    RadioGroup rgPessoas;

    Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtConsumoTotal = (EditText) findViewById(R.id.edtConsumoTotal);
        edtCouvert = (EditText) findViewById(R.id.edtCouvert);
        edtCustoTotal = (EditText) findViewById(R.id.edtCustoTotal);
        edtValorPessoa = (EditText) findViewById(R.id.edtValorPessoa);

        rgTaxa = (RadioGroup) findViewById(R.id.rgTaxa);
        rgPessoas = (RadioGroup) findViewById(R.id.rgPessoas);

        btnDividir = (Button) findViewById(R.id.btnDividir);
    }

    public void btnDividirClick(View v) {

        double consumo;
        double novoConsumo = 0.0;
        double custoTotal = 0.0;
        double novoCouvert = 0.0;
        double valorPessoa;
        double couvert;
        int opTaxa;
        int opPessoa;

        if (edtConsumoTotal.getText().length() > 0) {
            consumo = Double.parseDouble(edtConsumoTotal.getText().toString());
            couvert = Double.parseDouble(edtCouvert.getText().toString());
            opTaxa = rgTaxa.getCheckedRadioButtonId();
            opPessoa = rgPessoas.getCheckedRadioButtonId();

            if (opTaxa == R.id.rbSim) {

                if (opPessoa == R.id.rb2) {
                    novoConsumo = (consumo * 1.10);
                    novoCouvert = couvert * 2;

                    custoTotal = novoCouvert + novoConsumo;
                    valorPessoa = custoTotal / 2;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }else if (opPessoa == R.id.rb3) {
                    novoConsumo = (consumo * 1.10);
                    novoCouvert = couvert * 3;

                    custoTotal = novoCouvert + novoConsumo;
                    valorPessoa = custoTotal / 3;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }else if (opPessoa == R.id.rb4) {
                    novoConsumo = (consumo * 1.10);
                    novoCouvert = couvert * 4;

                    custoTotal = novoCouvert + novoConsumo;
                    valorPessoa = custoTotal / 4;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }else {
                    novoConsumo = (consumo * 1.10);
                    novoCouvert = couvert * 5;

                    custoTotal = novoCouvert + novoConsumo;
                    valorPessoa = custoTotal / 5;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }


            } else {
                if (opPessoa == R.id.rb2) {
                    novoCouvert = couvert * 2;

                    custoTotal = novoCouvert + consumo;
                    valorPessoa = custoTotal / 2;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }else if (opPessoa == R.id.rb3) {
                    novoCouvert = couvert * 3;

                    custoTotal = novoCouvert + consumo;
                    valorPessoa = custoTotal / 3;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }else if (opPessoa == R.id.rb4) {
                novoCouvert = couvert * 4;

                custoTotal = novoCouvert + consumo;
                valorPessoa = custoTotal / 4;

                edtCustoTotal.setText("" + custoTotal);
                edtValorPessoa.setText("" + valorPessoa);
            }else {
                    novoCouvert = couvert * 5;

                    custoTotal = novoCouvert + consumo;
                    valorPessoa = custoTotal / 5;

                    edtCustoTotal.setText("" + custoTotal);
                    edtValorPessoa.setText("" + valorPessoa);
                }


            }
        }
    }
}
