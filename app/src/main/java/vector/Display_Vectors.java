package vector;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import android.widget.Toast;

import com.marttcode.vectores3d.R;

public class Display_Vectors {


    /**
     * In this array save all result it the position 6 to 8
     * In case some case 6 to 11 (Unit vector)
     */
    private double[] array_vectors;


    /**
     * Constructor need the array send for the inicio_menu class
     * @param array_vectors Values saved in the 6 fists positions
     */
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
     * Despliega resultados del vector
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
        stringFormateada = String.format(recurso, array_vectors[x], array_vectors[y], array_vectors[z]);
        vector.setText(stringFormateada);
    }


    /**
     * Calcula la suma de los vectores y los almacena
     * en las posiciones 6 hasta 8 del arreglo
     * para que después las despliege
     */
    public void addition_vectors(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        Vector3D result_vector = vector1.addition(vector2);

        array_vectors[6] = result_vector.getX();
        array_vectors[7] = result_vector.getY();
        array_vectors[8] = result_vector.getZ();
    }


    /**
     * Resta los vectores y los alamcena en las tres ultimas
     * pocissiones del arreglo
     */
    public void extraction_vectors(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        Vector3D result_vector = vector1.subtraction(vector2);

        array_vectors[6] = result_vector.getX();
        array_vectors[7] = result_vector.getY();
        array_vectors[8] = result_vector.getZ();
    }


    /**
     * Producto punto alamcena el resultado en la pocision 6 del arreglo
     */
    public void point_product(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        double result = vector1.cross_point(vector2);

        array_vectors[6] = result;
    }


    /**
     * Producto cruz
     */
    public void cross_product(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        Vector3D result_vector = vector1.cross_product(vector2);

        array_vectors[6] = result_vector.getX();
        array_vectors[7] = result_vector.getY();
        array_vectors[8] = result_vector.getZ();
    }


    /**
     * Vector unitario, despues de calcular el resultado
     * de cada vector unitario los alamcena en las utlimas
     * 6 posiciones
     */
    public void unit_vector(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        Vector3D result_vector_unit1 = vector1.unit();
        Vector3D result_vector_unit2 = vector2.unit();

        array_vectors[6] = result_vector_unit1.getX();
        array_vectors[7] = result_vector_unit1.getY();
        array_vectors[8] = result_vector_unit1.getZ();
        array_vectors[9] = result_vector_unit2.getX();
        array_vectors[10] = result_vector_unit2.getY();
        array_vectors[11] = result_vector_unit2.getZ();
    }


    /**
     *Modulo
     */
    public void length_vector(){
        Vector3D vector1 = new Vector3D(array_vectors[0], array_vectors[1], array_vectors[2]);
        Vector3D vector2 = new Vector3D(array_vectors[3], array_vectors[4], array_vectors[5]);

        array_vectors[6] = vector1.length_vector();
        array_vectors[7] = vector2.length_vector();
    }
}
