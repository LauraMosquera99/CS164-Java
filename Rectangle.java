public class Rectangle extends Shape {
    private double Height;
    private double Width;
//def constructor
public Rectangle(){
    this.Height = 1.0;
    this.Width = 1.0;
    }
public Rectangle(double height, double width) {
    this.Height = Math.abs(height);
    this.Width = Math.abs(width);
}
public double getHeight(){
    return Height;
}
public double getWidth(){
    return Width;
}
public void setHeight(double height){
    this.Height = Math.abs(height);
}
public void setWidth(double width){
    this.Width = Math.abs(width);
}
public double getArea() {
    return Height * Width;
}
@Override
public String toString() {
    return "Rectangle: \n" +
            "HxW: " + Height + "x" + Width + "\n" + 
            String.format("Area: %.2f", this.getArea());
}
}
    

