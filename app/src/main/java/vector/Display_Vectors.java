package vector;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import android.widget.Toast;
import android.content.res.Resources;

import com.marttcode.vectores3d.R;

public class Display_Vectors {

    private double[] array_vectors;

    public Display_Vectors(){

    }

    public Display_Vectors(double[] array_vectors){
        this.array_vectors = array_vectors;
    }


    /**
     * Error message when fill vector values
     * @param activity Need the activity context for know where show
     * @return a Toast for show in required activity
     */
    public Toast empty_values(Context activity){

        return Toast.makeText(activity, R.string.error_fill, Toast.LENGTH_SHORT);
    }


    /**
     * Despliega valores del vector
     * @param xml_string Id de la etiqueta XML de donde extraera el string a formatear
     * @param x Posicion en el arreglo del eje X
     * @param y Posicion en el arreglo del eje Y
     * @param z Posicion en el arreglo del eje Z
     * @param vector Vista donde desplegara el vector
     */
    public void display_vectors(int xml_string, int x, int y, int z, TextView vector, Context actividad){
        String recurso, stringFormateada;
        Resources res = actividad.getResources();

        recurso = res.getString(xml_string);
        stringFormateada = String.format(recurso, ""+array_vectors[x], ""+array_vectors[y], ""+array_vectors[z]);
        vector.setText(stringFormateada);
    }


    /**
     * Calcula la suma de los vectores.
     */
    public void addition_vectors(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        Vector3D result_vector = vector1.addition(vector2);

        array_vectors[6] = result_vector.getX();
        array_vectors[7] = result_vector.getY();
        array_vectors[8] = result_vector.getZ();
    }
}
