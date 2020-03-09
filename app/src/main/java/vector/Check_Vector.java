package vector;

import android.content.Context;
import android.widget.Toast;

import com.marttcode.vectores3d.R;

public class Check_Vector {


    public Check_Vector(){

    }


    /**
     * Check if all vales are valid
     * @param vectores
     * @return true if all vectors are valid
     */
    public boolean check_vectors(double [] vectores){

        int correct_value = 0;

        for (int i=0; i < 6; i++) {
            if (vectores[i] != 0){
                correct_value += 1;
            }
        }

        if (correct_value == 6 ){
            return true;
        }else {
            return false;
        }
    }


    /**
     * Error message when fill vector values
     * @param activity Need the activity context for know where show
     * @return a Toast for show in required activity
     */
    public Toast empty_values(Context activity){

        return Toast.makeText(activity, R.string.error_fill, Toast.LENGTH_SHORT);
    }
}
