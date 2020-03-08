package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class inicio_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch ( id ){
            case R.id.item1:
                startActivity(new Intent(this, suma.class));
                break;
            case R.id.item2:
                startActivity(new Intent(this, resta.class));
                break;
            case R.id.item3:
                startActivity(new Intent(this, producto_punto.class));
                break;
            case R.id.item4:
                startActivity(new Intent(this, producto_cruz.class));
                break;
            case R.id.item5:
                startActivity(new Intent(this, vector_unitario.class));
                break;
            case R.id.item6:
                startActivity(new Intent(this, modulo.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
