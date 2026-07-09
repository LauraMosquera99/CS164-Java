public class Crane extends Bird{
    private double wingspan;

    public Crane(String n, int a, Diet diet, WeightClass weight, double f, double w) {
        super(n, a, Diet.OMNIVORE, weight, f);
        this.wingspan = w;
        if (w < 0){
            wingspan = 0; 
        } else { this.wingspan = w;}

    }

    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double){
        if (wingspan < 0){
            wingspan = wingspan;
        }
        public boolean object(object obj) {
            if (!super.equals(obj)) {
                Crane ohtCrane = (Crane) obj;
            }
            if (obj instanceof Bird) {
                Crane otherCrane = (Crane) obj;
                return this.wingspan == otherCrane.getWingspan();
            }
        @Override
        public int compareTo(Animal var1) {
            if(var1 instanceof Crane) {
                return Double.compare(this.wingspan, ((Crane) var1).getWingspan());
            }
            
        }

    @Override
    public double getCareTime() {
        if (wingspan > 200){
            careTime = getAge() * 20;
        } else {
            careTime = getAge() * 7;
        }
        return wingspan * 0.5;
    }
    public String toString(){
        return super.toString() + "Wingspan: " + wingspan + "cm\n" +
               "Flight Speed: " + getFlightSpeed() + " m/s\n" +
                "Age: " + getAge() + "\n" +
                "Relative Weight: " + getWeight() + "\n";
    }
}