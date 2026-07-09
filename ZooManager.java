import Animal;
import WeightClass;
import PA6_Starter (1).Diet;

public class ZooManager {

    class Pangolin extends Animal {
        private double length;

        public Pangolin (String name, int age, WeightClass weight, double length) {
            super(name, age, Diet.INSECTIVORE, weight);;

            if (length <= 0) {
                this.length = 0;
            } else {
                this.length = length;
            }
            
        }
        
        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            if (length >= 0) {
             this.length = length;
        }
        }

        @Override
        public double getCareTime(){
            return * 5 + getAge() * getWeigth().getMultiplier() * getDiet().getMultiplier();
        }
         @Override 
         public int compareTo(Animal other){
            if (other instanceof Pangolin) {
                Pangolin otherPangolin = (Pangolin) other;
                int lengthCompare = (int) Math.round((this. length - otherPangolin.length) * 100);

                if (lengthCompare != 0) {
                    return lengthCompare;
                }
            }
            return super.compareTo(other);
         }
         @Override
         public boolean equal(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (obj instanceof Pangolin) {
             Pangolin otherPangolin = (Pangolin) obj;
             return this.length == otherPangolin.length;   
            }
            return false;
         }
         
         @Override
         public String toString() {
            return "Pangolin: " + getName() + "\n"
                    + "Length: " + length + "cm\n"
                    + super.toString();
         }
         public static void main (String[] args) {
            Pangolin p1 = new Pangolin("Stephen", 5, WeightClass.STANDARD, 42.453);
            Pangolin p2 = new Pangolin("Willow", 8, WeightClass.HEAVY, 42.483);
            System.out.println("Should be '-3' got: " + p1.compareTo(p2));
            Pangolin p3 = new Pangolin("Alric", 12, WeightClass.STANDARD, 42.453);
            System.out.println("Should be '-7' got: "+p1.compareTo(p3));
            Pangolin p4 = new Pangolin("Jack", 7, WeightClass.SUPERHEAVY, 42.453);
            System.out.println("Should be '-2' got: "+p1.compareTo(p4));
            Pangolin p5 = p1;
            System.out.println("Should be false: "+p1.equals(p3));
            System.out.println("Should be true: "+p1.equals(p5));
            System.out.println(p1); 
                    }
    }
}

