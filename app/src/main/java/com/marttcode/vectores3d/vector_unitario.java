package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import vector.Display_Vectors;

public class vector_unitario extends AppCompatActivity {


    private TextView vector1, vector2, result1, result2;
    private Display_Vectors execute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_unitario);

        vector1 = findViewById(R.id.vector_unitario_vector1);
        vector2 = findViewById(R.id.vector_unitario_vector2);
        result1 = findViewById(R.id.vector_unitario_result1);
        result2 = findViewById(R.id.vector_unitario_result2);

        Bundle bolsa_resivida = getIntent().getExtras();
        double[] vector_array = bolsa_resivida.getDoubleArray("VECTORES");
        execute = new Display_Vectors(vector_array);

        show_vectors();
        unit_vector();
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
    private void unit_vector(){
        execute.unit_vector();

        execute.display_vectors(R.string.resutl1, 6,7,8, result1, this);
        execute.display_vectors(R.string.resutl2, 9,10,11, result2, this);
    }
}
