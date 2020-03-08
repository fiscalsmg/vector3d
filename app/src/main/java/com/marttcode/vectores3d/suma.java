package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        Resources res = getResources();
        String recurso = res.getString(R.string.suma_result);
        String stringFormateada = String.format(recurso, "James", "Hola", "Puto");

        TextView texto = findViewById(R.id.suma_result);
        texto.setText(stringFormateada);

    }
}
