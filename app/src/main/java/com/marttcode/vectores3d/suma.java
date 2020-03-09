package com.marttcode.vectores3d;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        Bundle bolsa_resivida = getIntent().getExtras();
        double[] numero_resivido = bolsa_resivida.getDoubleArray("VECTORES");

        Resources res = getResources();
        String recurso = res.getString(R.string.suma_vector1);
        String stringFormateada = String.format(recurso, ""+numero_resivido[0], ""+numero_resivido[1], ""+numero_resivido[2]);

        TextView texto = findViewById(R.id.suma_vector1);
        texto.setText(stringFormateada);

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
