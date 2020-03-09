package com.marttcode.vectores3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import vector.Check_Vector;

public class inicio_menu extends AppCompatActivity {

    private int [] vectores = new int[6];
    private EditText vector1_result1, vector1_result2, vector1_result3, vector2_result1, vector2_result2, vector2_result3;
    private Check_Vector ckeck = new Check_Vector();

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
            switch (id) {
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
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Check if all values was fill
     * @return True if all it's OK
     */
    private boolean fill_array_vectors() {
        try{
            vectores[0] = Integer.parseInt(vector1_result1.getText().toString());
            vectores[1] = Integer.parseInt(vector1_result2.getText().toString());
            vectores[2] = Integer.parseInt(vector1_result3.getText().toString());
            vectores[3] = Integer.parseInt(vector2_result1.getText().toString());
            vectores[4] = Integer.parseInt(vector2_result2.getText().toString());
            vectores[5] = Integer.parseInt(vector2_result3.getText().toString());

            ckeck.check_vectors(vectores);

            return true;
        }catch (Exception e) {
            ckeck.empty_values(this).show();
            return false;
        }
    }
}
