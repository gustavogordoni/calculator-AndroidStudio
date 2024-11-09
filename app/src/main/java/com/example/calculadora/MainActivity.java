package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum01;
    private EditText txtNum02;
    private TextView labelResultValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtNum01 = findViewById(R.id.txtNum01);
        txtNum02 = findViewById(R.id.txtNum02);
        labelResultValue = findViewById(R.id.labelResultValue);
    }

    public void somar(View view) {
        double valor01 = Double.parseDouble(txtNum01.getText().toString());
        double valor02 = Double.parseDouble(txtNum02.getText().toString());
        labelResultValue.setText(String.valueOf((valor01 + valor02)));
    }

    public void subtrair(View view) {
        double valor01 = Double.parseDouble(txtNum01.getText().toString());
        double valor02 = Double.parseDouble(txtNum02.getText().toString());
        labelResultValue.setText(String.valueOf((valor01 - valor02)));
    }

    public void multiplicar(View view) {
        double valor01 = Double.parseDouble(txtNum01.getText().toString());
        double valor02 = Double.parseDouble(txtNum02.getText().toString());
        labelResultValue.setText(String.valueOf((valor01 * valor02)));
    }

    public void dividir(View view) {
        double valor01 = Double.parseDouble(txtNum01.getText().toString());
        double valor02 = Double.parseDouble(txtNum02.getText().toString());
        labelResultValue.setText(String.valueOf((valor01 / valor02)));
    }
}