public class Point2D {
    private float x = 0, y = 0;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] temp = new float[2];
        temp[0] = x;
        temp[1] = y;
        return temp;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
