package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import vector.Check_Vector;

public class inicio_menu extends AppCompatActivity {

    private double [] vectores = new double[9];
    private EditText vector1_result1, vector1_result2, vector1_result3, vector2_result1, vector2_result2, vector2_result3;
    private Check_Vector ckeck = new Check_Vector();
    private Bundle bolsa = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_menu);

        set_views_to_activities();
    }


    /**
     *Asigna vistas de mi actividad de inicio,
     *
     */
    private void set_views_to_activities(){
        vector1_result1 = findViewById(R.id.vector1_value1);
        vector1_result2 = findViewById(R.id.vector1_value2);
        vector1_result3 = findViewById(R.id.vector1_value3);
        vector2_result1 = findViewById(R.id.vector2_value1);
        vector2_result2 = findViewById(R.id.vector2_value2);
        vector2_result3 = findViewById(R.id.vector2_value3);
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

        if (fill_array_vectors()) {

            bolsa.putDoubleArray("VECTORES", vectores);

            Intent intent = new Intent();
            intent.putExtras(bolsa);

            switch (id) {
                case R.id.item1:
                    intent.setClass(this, suma.class);
                    startActivity(intent);
                    break;
                case R.id.item2:
                    intent.setClass(this, resta.class);
                    startActivity(intent);
                    break;
                case R.id.item3:
                    intent.setClass(this, producto_punto.class);
                    startActivity(intent);
                    break;
                case R.id.item4:
                    intent.setClass(this, producto_cruz.class);
                    startActivity(intent);
                    break;
                case R.id.item5:
                    intent.setClass(this, vector_unitario.class);
                    startActivity(intent);
                    break;
                case R.id.item6:
                    intent.setClass(this, modulo.class);
                    startActivity(intent);
                    break;
            }
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    /**
     * Check if all values was fill
     * @return True if all it's OK
     */
    private boolean fill_array_vectors() {
        try{
            vectores[0] = Double.parseDouble(vector1_result1.getText().toString());
            vectores[1] = Double.parseDouble(vector1_result2.getText().toString());
            vectores[2] = Double.parseDouble(vector1_result3.getText().toString());
            vectores[3] = Double.parseDouble(vector2_result1.getText().toString());
            vectores[4] = Double.parseDouble(vector2_result2.getText().toString());
            vectores[5] = Double.parseDouble(vector2_result3.getText().toString());
            vectores[6] = 0;
            vectores[7] = 0;
            vectores[8] = 0;

            return true;
        }catch (Exception e) {
            ckeck.empty_values(this).show();
            return false;
        }
    }
}
