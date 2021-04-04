package com.example.proyectodenotas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.LocusId;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Inicializando Variables
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView btn_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscare y traere los ID de el modo grafico
        et1 = (EditText)findViewById(R.id.txt_lenguaje);
        et2 = (EditText)findViewById(R.id.txt_matematicas);
        et3 = (EditText)findViewById(R.id.txt_historia);
        btn_resultado = (TextView)findViewById(R.id.txt_resultado);

    }

    // Realizaremos la operacion

    // Pasaremos de Texto a String


    public void Operacion(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();

        // Pasaremos los valores a Int
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);

        // Declaramos la variable del resultado

        int operation = ((num1 + num2 + num3) / 3);

        if (num1 <= 0 || num1 >= 11) {
            btn_resultado.setText("Solo Notas Entre 1 y 10");
        } else if (num2 <= 0 || num2 >= 11) {
            btn_resultado.setText("Solo Notas Entre 1 y 10");
        } else if (num3 <= 0 || num3 >= 11) {
            btn_resultado.setText("Solo Notas Entre 1 y 10");
        } else if (operation >=40 ) {
            btn_resultado.setText("Aprobado Con " + operation);
        } else if (operation <=41){
            btn_resultado.setText("Reprobado Con " + operation);
        }


    }
}


