package com.marttcode.vectores3d;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import vector.Vector3D;

public class suma extends AppCompatActivity {

    private TextView vector1, vector2, result;
    private Bundle bolsa_resivida;
    private double[] vector_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        vector1 = findViewById(R.id.suma_vector1);
        vector2 = findViewById(R.id.suma_vector2);
        result = findViewById(R.id.suma_result);

        bolsa_resivida = getIntent().getExtras();
        vector_array = bolsa_resivida.getDoubleArray("VECTORES");

        show_vectores();
        ejecut_suma_vectores();
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
     * Despliega valores del vector
     * @param xml_string Id de la etiqueta XML de donde extraera el string a formatear
     * @param x Posicion en el arreglo del eje X
     * @param y Posicion en el arreglo del eje Y
     * @param z Posicion en el arreglo del eje Z
     * @param vector Vista donde desplegara el vector
     */
    private void display_vectores(int xml_string, int x, int y, int z, TextView vector){
        String recurso, stringFormateada;
        Resources res = getResources();

        recurso = res.getString(xml_string);
        stringFormateada = String.format(recurso, ""+vector_array[x], ""+vector_array[y], ""+vector_array[z]);
        vector.setText(stringFormateada);
    }


    /**
     * Extrae los valores del los vectores del array enviado desde el menú
     * y los despliega.
     */
    private void show_vectores(){
        display_vectores(R.string.suma_vector1, 0,1,2, vector1);
        display_vectores(R.string.suma_vector2, 3,4,5, vector2);
    }


    /**
     * Calcula la suma de los vectores.
     */
    private void ejecut_suma_vectores(){
        Vector3D vector1 = new Vector3D(vector_array[0], vector_array[1], vector_array[2]);
        Vector3D vector2 = new Vector3D(vector_array[3], vector_array[4], vector_array[5]);

        Vector3D result_vector = vector1.addition(vector2);

        vector_array[6] = result_vector.getX();
        vector_array[7] = result_vector.getY();
        vector_array[8] = result_vector.getZ();

        display_vectores(R.string.suma_result, 6,7,8, result);
    }
}
