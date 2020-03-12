package com.marttcode.vectores3d;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import vector.Display_Vectors;

public class resta extends AppCompatActivity {

    private TextView vector1, vector2, result;
    private Bundle bolsa_resivida;
    private double[] vector_array;
    private Display_Vectors execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        vector1 = findViewById(R.id.resta_vector1);
        vector2 = findViewById(R.id.resta_vector2);
        result = findViewById(R.id.resta_result);

        bolsa_resivida = getIntent().getExtras();
        vector_array = bolsa_resivida.getDoubleArray("VECTORES");
        execute = new Display_Vectors(vector_array);

        show_vectors();
        extraction_vectors();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    /**
     * Extrae los valores del los vectores del array enviado desde el menú
     * y los despliega utilizando una clase externa.
     */
    private void show_vectors(){
        execute.display_vectors(R.string.vector1, 0,1,2, vector1, this);
        execute.display_vectors(R.string.vector2, 3,4,5, vector2, this);
    }


    /**
     * Calcula la suma de los vectores, enviando los datos a otra clase.
     */
    private void extraction_vectors(){
        execute.extraction_vectors();

        execute.display_vectors(R.string.resutl, 6,7,8, result, this);
    }
}
