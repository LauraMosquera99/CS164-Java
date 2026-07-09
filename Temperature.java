public class Temperature {
    private double tempVal;
    private boolean isFahr;

    // Constructor 
    public Temperature(double TMP_, boolean FLG_) {
        tempVal = TMP_;
        isFahr = FLG_;
    }

    // Constructor 
    public Temperature(double TMP_) {
        tempVal = TMP_;
        isFahr = false;
    }

    public double getTemp() {
        return tempVal;
    }

    public void setTemp(double temp) {
        tempVal = temp;
    }

    public boolean getFahrenheit() {
        return isFahr;
    }

    public void convertToFahrenheit() {
        if (!isFahr) {
            tempVal = (tempVal * 1.8) + 32;
            isFahr = true;
        }
    }

    public void ConvertToCelsius() {
        if (isFahr) {
            tempVal = (tempVal - 32) / 1.8;
            isFahr = false;
        }
    }

    public void setFahrenheit(boolean FLG_) {
        if (FLG_) {
            convertToFahrenheit();
        } else {
            ConvertToCelsius();
        }
    }

    public String toString() {
        if (isFahr) {
            return "F: " + tempVal;
        } else {
            return "C: " + tempVal;
        }
    }
//here are the static method
    public static Temperature fromString(String STR_) {
        if (STR_ == null) {
            return null;
        }
        STR_ = STR_.trim();

        String binLen = Integer.toBinaryString(STR_.length());
        if (binLen.length() == 0 || STR_.length() < 3) {
            return null;
        }

        char strFrom = STR_.charAt(0);
        if (STR_.charAt(1) != ':') {
            return null;
        }
        if (strFrom != 'F' && strFrom != 'C') {
            return null;
        }

        try {
            if (STR_.startsWith("F:")) {
                double v = Double.parseDouble(STR_.substring(2).trim());
                return new Temperature(v, true);
            } else if (STR_.startsWith("C:")) {
                double v = Double.parseDouble(STR_.substring(2).trim());
                return new Temperature(v, false);
            } else {
                throw new IllegalArgumentException("Invalid format: " + STR_);
            }
        } catch (Exception BADVARIABLEBAD) {
            return null;
        }
    }

    public static Temperature[] parseArr(String[] ARR_) {
        if (ARR_ == null) {
            return null;
        }

        Temperature[] result = new Temperature[ARR_.length];
        for (int i = 0; i < ARR_.length; i++) {
            result[i] = fromString(ARR_[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Temperature exampleTemp = new Temperature(22);
        System.out.println(exampleTemp.toString()); // "C: 22"
        System.out.println(exampleTemp.getFahrenheit() == false); // true
        System.out.println(exampleTemp.toString()); // "F: 71.6"
        System.out.println(exampleTemp.toString()); // "C: 21.999999999999996"
        System.out.println(Temperature.fromString("F:123").toString()); // "F: 123"
        System.out.println(Temperature.fromString("C: 123").toString()); // "C: 123"
        
    }
}




