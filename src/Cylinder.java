public class Cylinder extends Circle {
    private double height;
    private double volume;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = this.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
