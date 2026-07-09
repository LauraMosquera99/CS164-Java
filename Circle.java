public class Circle extends Shape {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        this.radius = Math.abs(rad);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle:\nRadius: "+this.radius+"\n" + super.toString();
    }

}
