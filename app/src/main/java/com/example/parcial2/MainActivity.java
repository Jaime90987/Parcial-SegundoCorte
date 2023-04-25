package com.example.parcial2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    TextView resultado;
    TextInputLayout numero;
    String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itComponents();
        initListeners();
    }

    private void itComponents() {
        calcular = findViewById(R.id.btn_calcular);
        numero = findViewById(R.id.ti_Number);
        resultado = findViewById(R.id.tv_fibo);
    }

    private void initListeners() {
        calcular.setOnClickListener(view -> {
            validate();
        });
    }

    private void validate() {
        valor = Objects.requireNonNull(numero.getEditText()).getText().toString().trim();

        if (valor.isEmpty()) {
            resultado.setText("");
            alert("Por favor ingrese un valor");
            return;
        }

        if (valor.equals("0")) {
            resultado.setText("");
            alert("Error, el valor debe ser un número mayor a cero");
            return;
        }

        Fibonacci fibonnacci = new Fibonacci(Integer.parseInt(valor));
        int fibo = fibonnacci.getFibonacci();
        resultado.setText(String.valueOf(fibo));
    }

    private void alert(String title) {
        new AlertDialog.Builder(this)
                .setMessage(title)
                .setPositiveButton(android.R.string.yes, (dialogInterface, i) -> {
                })
                .show();
    }
}