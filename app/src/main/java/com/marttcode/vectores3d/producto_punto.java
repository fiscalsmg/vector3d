package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import vector.Display_Vectors;

public class producto_punto extends AppCompatActivity {


    private TextView vector1, vector2, result;
    private Bundle bolsa_resivida;
    private double[] vector_array;
    private Display_Vectors execute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_punto);

        vector1 = findViewById(R.id.producto_punto_vector1);
        vector2 = findViewById(R.id.producto_punto_vector2);
        result = findViewById(R.id.producto_punto_result);

        bolsa_resivida = getIntent().getExtras();
        vector_array = bolsa_resivida.getDoubleArray("VECTORES");
        execute = new Display_Vectors(vector_array);

        show_vectors();
        point_product();
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
     * Calcula el producto punto de los vectores, enviando los datos a otra clase.
     */
    private void point_product(){
        execute.point_product();

        execute.display_vectors(R.string.producto_punto_result, 6,7,8, result, this);
    }
}
