public abstract class Bird extends Animal implements Comparable<Bird>{
    private double flightSpeed;

    //public abstract double flightSpeed(double f);
       
    public Bird(String n, int a, Diet diet, WeightClass weight, double f){
        super(n,a, diet, weight);  //animal has name and age I'll call it here
        //super.Diet = Diet;
        this.flightSpeed = f;
        if (f < 0){
            this.flightSpeed = 0;
        } else {
            this.flightSpeed = f;
        }
    }
    
    public double getFlightSpeed() {
        return flightSpeed;
    }
    public void setFlightSpeed(double f){
        //flightSpeed = f;
        if (f < 0) {
            flightSpeed = 0;
        } else {
            flightSpeed = f;
        }
    }
    @Override //this is the equals object
    public boolean equals (Object obj){
        if (!super.equals(obj)) {
            return false;
        }

        if (obj instanceof Bird) {
            Bird otherBird = (Bird) obj;
            return this.flightSpeed == otherBird.getFlightSpeed();
        }
        return false;
    }
    public int compareTo(Bird other) {

        //this.getFlightSpeed();
       // other.getFlightSpeed();
        
        double speed1= Math.round(this.getFlightSpeed() * 100.0) / 100.0;
        double speed2= Math.round(other.getFlightSpeed() * 100.0) / 100.0;

            int value = Double.compare(speed1, speed2);
            if (value !=0){
                return value;
            }
            return super.compareTo(other);
        }

    @Override
    public String toString() {
        return super.toString() + "Flight Speed: " + flightSpeed + "m/s\n" +
               "Age: " + getAge() + " years\n" +
                "Diet: " + getDiet() + "\n" +
                "Relative Weight: " + getWeight() + "\n";
    }
}

