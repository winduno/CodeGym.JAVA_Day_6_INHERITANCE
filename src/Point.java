public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

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

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrayXY = new float[2];
        arrayXY[0] = x;
        arrayXY[1] = y;
        return arrayXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
