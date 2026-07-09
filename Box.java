public class Box extends Rectangle{
 
private double depth; 
 // df constructure
 public Box() {
    super(1.0, 1.0);
    this.depth = 1.0;
 }
// 3 arg constructor
public Box(double height, double width, double depth) {
    super(height, width);
    this.depth = depth;
}

 public double getDepth(){
    return depth;
 }
 //same restrictions as rect?? 
public void setDepth(double depth){
    this.depth = Math.abs(depth);
}
@Override
public double getArea() {
    return getHeight()  * getWidth() * depth;

}
@Override
public String toString() {
        return "Box:\n" +
               "HxWxD: " + getHeight() + "x" + getWidth() + "x" + depth + "\n" +
               String.format("Volume: %.2f", this.getArea());
}

}


