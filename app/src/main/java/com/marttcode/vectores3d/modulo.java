package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import vector.Display_Vectors;

public class modulo extends AppCompatActivity {

    private TextView vector1, vector2, result1, result2;
    private Bundle bolsa_resivida;
    private double[] vector_array;
    private Display_Vectors execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo);

        vector1 = findViewById(R.id.modulo_vector1);
        vector2 = findViewById(R.id.modulo_vector2);
        result1 = findViewById(R.id.modulo_result1);
        result2 = findViewById(R.id.modulo_result2);

        bolsa_resivida = getIntent().getExtras();
        vector_array = bolsa_resivida.getDoubleArray("VECTORES");
        execute = new Display_Vectors(vector_array);

        show_vectors();
        module_vectors();
    }

    /**
     * Extrae los valores del los vectores del array enviado desde el menú
     * y los despliega utilizando una clase externa.
     */
    private void show_vectors(){
        execute.display_vectors(R.string.modulo_vector1, 0,1,2, vector1, this);
        execute.display_vectors(R.string.modulo_vector2, 3,4,5, vector2, this);
    }


    /**
     * Calcula la suma de los vectores, enviando los datos a otra clase.
     */
    private void module_vectors(){
        execute.length_vector();

        String recurso, stringFormateada;
        Resources res = getResources();

        recurso = res.getString(R.string.modulo_result1);
        stringFormateada = String.format(recurso, ""+vector_array[6]);
        result1.setText(stringFormateada);

        recurso = res.getString(R.string.modulo_result2);
        stringFormateada = String.format(recurso, ""+vector_array[7]);
        result2.setText(stringFormateada);
    }

}
