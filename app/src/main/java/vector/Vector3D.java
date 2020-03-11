package vector;

public class Vector3D {


    /**
    * This are the globals variable for the three vector's dimension
    */
    private double x, y, z;


    /**
    * Constructor default and constructor with params
    */
    public Vector3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }


    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    /**
     * Make de addition for 2 vectors
     * @param vector the vector to add the vector in use
     * @return a new vector, result vector
     */
    public Vector3D addition(Vector3D vector){
        Vector3D result_vector = new Vector3D();

        result_vector.setX(this.x + vector.getX());
        result_vector.setY(this.y + vector.getY());
        result_vector.setZ(this.z + vector.getZ());

        return result_vector;
    }


    /**
     * Make de subtraction for a some vector
     * @param vector Need the vector to subtract
     * @return a new vector, result vector
     */
    public Vector3D subtraction(Vector3D vector){
        Vector3D result_vector = new Vector3D();

        result_vector.setX(this.x - vector.getX());
        result_vector.setY(this.y - vector.getY());
        result_vector.setZ(this.z - vector.getZ());

        return result_vector;
    }


    /**
     * Make the module for a vector in use
     * @return a float value with the result
     */
    public  double length_vector(){

        double result = Math.sqrt( this.x * this.x + this.y * this.y + this.z * this.z );

        return result;
    }


    /**
     * Make the unit vector, use the method length
     * @return a second vector which is the result
     */
    public Vector3D unit(){
        Vector3D result_vector = new Vector3D();
        double length = length_vector();

        result_vector.setX(this.x / length);
        result_vector.setY(this.y / length);
        result_vector.setZ(this.z / length);

        return result_vector;
    }


    /**
     * I don't know for what is this method
     * @param scalar
     * @return
     */
    public Vector3D scalar(double scalar){
        Vector3D result_vector = new Vector3D(scalar * this.x, scalar * this.y, scalar * this.z);

        return result_vector;
    }


    /**
     * Make the cross_product
     * @param vector Need a vector to do the operation
     * @return a new vector with the operation result
     */
    public Vector3D cross_product(Vector3D vector){
        Vector3D result_vector = new Vector3D();

        result_vector.setX( this.y * vector.getZ() - this.z * vector.getY() );
        result_vector.setY( -this.x * vector.getZ() + this.z * vector.getX() );
        result_vector.setZ( this.x * vector.getY() - this.y * vector.getX() );          //Check this

        return result_vector;
    }


    /**
     *
     * @param vector
     * @return
     */
    public double cross_point(Vector3D vector){
        double resutl = this.x * vector.getX() + this.y * vector.getY() + this.z * vector.getZ();

        return resutl;
    }


    /**
    * Getter and setter
    */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
