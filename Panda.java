public class Lion extends Animal {
    private double tailLength;

    public Lion(String name, int age, WeightClass weight, double tailLength) {
        super(name, age, Diet.CARNIVORE, weight);

        if (tailLength < 0) {
            this.tailLength = 0;
        } else {
            this.tailLength = tailLength;
        }
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        if (tailLength >= 0) {
            this.tailLength = tailLength;
        }
    }

    @Override
    public int compareTo(Animal other) {
        if (other instanceof Lion) {
            Lion otherLion = (Lion) other;
            int lengthCompare = (int) Math.round((this.tailLength - otherLion.tailLength) * 100);

            if (lengthCompare != 0) {
                return lengthCompare;
            }
        }
        return super.compareTo(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (obj instanceof Lion) {
            Lion otherLion = (Lion) obj;
            return this.tailLength == otherLion.tailLength;
        }

        return false;
    }

    @Override
    public double getCareTime() {
        return 20 * getAge() * getWeight().getMultiplier() * getDiet().getMultiplier();
    }

    @Override
    public String toString() {
        return "Lion: " + getName() + "\n"
                + "Tail Length: " + tailLength + "cm\n"
                + super.toString();
    }
}