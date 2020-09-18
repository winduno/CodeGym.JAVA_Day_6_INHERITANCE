public class Point3D extends Point2D{
    private float z;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] temp = new float[3];
        temp[0] = super.getX();
        temp[1] = super.getY();
        temp[2] = this.getZ();
        return temp;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "z=" + this.z +
                '}';
    }
}
