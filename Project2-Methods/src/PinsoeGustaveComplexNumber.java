public class PinsoeGustaveComplexNumber {
//    Instance variables
    private double a, b;

//    Constructor
    public PinsoeGustaveComplexNumber(double argA) {
        a = argA;
        b = 0;
    }

//    Constructor #2, in case there are two parameters
    public PinsoeGustaveComplexNumber(double argA, double argB) {
        a = argA;
        b = argB;
    }

//    Printing methods
    public String toString() {
        if (a == 0.0 && b == 0.0) {
            return "0";
        }

        if (b == 0.0) {
            if (a == (int)a) {
                return Integer.toString((int)a);
            }
            return Double.toString(a);
        }

        if (a == 0.0) {
            String imagPart;
            if (b == 1.0) {
                imagPart = "i";
            } else if (b == -1.0) {
                imagPart = "-i";
            } else if (b == (int)b) {
                imagPart = (int)b + "i";
            } else {
                imagPart = b + "i";
            }
            return imagPart;
        }

        String realPart;
        String imagPart;

        if (a == (int)a) {
            realPart = Integer.toString((int)a);
        } else {
            realPart = Double.toString(a);
        }

        if (b > 0) {
            if (b == 1.0) {
                imagPart = "+i";
            } else if (b == (int)b) {
                imagPart = "+" + (int)b + "i";
            } else {
                imagPart = "+" + b + "i";
            }
        } else {
            if (b == -1.0) {
                imagPart = "-i";
            } else if (b == (int)b) {
                imagPart = (int)b + "i";
            } else {
                imagPart = b + "i";
            }
        }
        return realPart + imagPart;
    }

//    Addition method
    public PinsoeGustaveComplexNumber plus(PinsoeGustaveComplexNumber c) {
        double newA = a + c.getA();
        double newB = a + c.getB();

        return new PinsoeGustaveComplexNumber(newA, newB);
    }

//    Subtracting method
    public PinsoeGustaveComplexNumber minus(PinsoeGustaveComplexNumber c) {
        double newA = a - c.getA();
        double newB = a - c.getB();

        return new PinsoeGustaveComplexNumber(newA, newB);
    }

//    Multiplication
    public PinsoeGustaveComplexNumber times(PinsoeGustaveComplexNumber c) {
        double cA = c.getA();
        double cB = c.getB();

        double newA = (a * cA) - (b * cB);
        double newB = (a * cB) + (b * cA);

        return new PinsoeGustaveComplexNumber(newA, newB);
    }
//     Exponential
    public PinsoeGustaveComplexNumber toThePowerOf(int e) {
        if (e == 0) {
            return new PinsoeGustaveComplexNumber(1.0);
        }
        if (e == 1) {
            return new PinsoeGustaveComplexNumber(a, b);
        }

        return this.times(this.toThePowerOf(e - 1));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

}
