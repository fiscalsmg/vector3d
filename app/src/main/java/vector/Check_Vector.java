package vector;

import android.content.Context;
import android.widget.Toast;

import com.marttcode.vectores3d.R;

public class Check_Vector {


    public Check_Vector(){

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
