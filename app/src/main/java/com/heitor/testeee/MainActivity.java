package com.heitor.testeee;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    private TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // VINCULA OS COMPONENTES XML COM JAVA
        tvContador = findViewById(R.id.tvContador);
        Button btnInc = findViewById(R.id.btnIncrementar);
        Button btnDec = findViewById(R.id.btnbtnDecrementar);

        // EVENTO DE CLICK PARA INCREMENTAR
        btnInc.setOnClickListener( v -> {
            contador++;
            atualizarInterface();
        });

        // EVENTO DE CLICK PARA DECREMENTAR
        btnDec.setOnClickListener(v -> {
            if (contador > 0) {
                contador--;
                atualizarInterface();
            }
        });
    }

    // METODO PARA CERNTRALIZAR E ATUALIZAR A UI
    private void atualizarInterface() {
        tvContador.setText(String.valueOf(contador));

        // REGRA DE MUDANCA DE COR AO ATINGIR LIMITE DE 10
        if (contador >= 20) {
            tvContador.setTextColor(Color.MAGENTA);
        } else if (contador >= 10) {
            tvContador.setTextColor(Color.RED);
        } else {
            tvContador.setTextColor(Color.BLACK);
        }
    }
}