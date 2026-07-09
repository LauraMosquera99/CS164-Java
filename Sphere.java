public class Sphere extends Circle {
    public Sphere() {
        this(1.0);
    }

    public Sphere(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {

        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
    @Override
    public String toString() {
        
        return String.format("Volume: %.2f", this.getArea());

    }
}