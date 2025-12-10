public class ComplexNumberDriver {
    public static void main(String[] args) {
        System.out.println("=== Testing ComplexNumber Class ===\n");

        // Test constructors
        System.out.println("1. Testing Constructors:");
        PinsoeGustaveComplexNumber c1 = new PinsoeGustaveComplexNumber(5);
        System.out.println("   c1 = new ComplexNumber(5) = " + c1);

        PinsoeGustaveComplexNumber c2 = new PinsoeGustaveComplexNumber(5, 4);
        System.out.println("   c2 = new ComplexNumber(5, 4) = " + c2);

        PinsoeGustaveComplexNumber c3 = new PinsoeGustaveComplexNumber(3, -2);
        System.out.println("   c3 = new ComplexNumber(3, -2) = " + c3);

        PinsoeGustaveComplexNumber c4 = new PinsoeGustaveComplexNumber(0, 2);
        System.out.println("   c4 = new ComplexNumber(0, 2) = " + c4);

        PinsoeGustaveComplexNumber c5 = new PinsoeGustaveComplexNumber(4, 0);
        System.out.println("   c5 = new ComplexNumber(4, 0) = " + c5);

        PinsoeGustaveComplexNumber c6 = new PinsoeGustaveComplexNumber(0, 0);
        System.out.println("   c6 = new ComplexNumber(0, 0) = " + c6);

        // Test accessor methods
        System.out.println("\n2. Testing Accessor Methods:");
        System.out.println("   c2.getA() = " + c2.getA());
        System.out.println("   c2.getB() = " + c2.getB());

        // Test addition
        System.out.println("\n3. Testing Addition:");
        PinsoeGustaveComplexNumber sum1 = c2.plus(c3); // (5+4i) + (3-2i)
        System.out.println("   (" + c2 + ") + (" + c3 + ") = " + sum1);

        // Test subtraction
        System.out.println("\n4. Testing Subtraction:");
        PinsoeGustaveComplexNumber diff1 = c2.minus(c3); // (5+4i) - (3-2i)
        System.out.println("   (" + c2 + ") - (" + c3 + ") = " + diff1);

        // Test multiplication
        System.out.println("\n5. Testing Multiplication:");
        PinsoeGustaveComplexNumber prod1 = c2.times(c3); // (5+4i) * (3-2i)
        System.out.println("   (" + c2 + ") * (" + c3 + ") = " + prod1);

        // Test with the example from assignment: (2+3i) * (4-2i)
        PinsoeGustaveComplexNumber ex1 = new PinsoeGustaveComplexNumber(2, 3);
        PinsoeGustaveComplexNumber ex2 = new PinsoeGustaveComplexNumber(4, -2);
        PinsoeGustaveComplexNumber prod2 = ex1.times(ex2);
        System.out.println("   (" + ex1 + ") * (" + ex2 + ") = " + prod2 + " (should be 14+8i)");

        // Test powers (recursive)
        System.out.println("\n6. Testing Powers (Recursive):");

        // Test z^0
        PinsoeGustaveComplexNumber pow0 = c2.toThePowerOf(0);
        System.out.println("   (" + c2 + ")^0 = " + pow0 + " (should be 1)");

        // Test z^1
        PinsoeGustaveComplexNumber pow1 = c2.toThePowerOf(1);
        System.out.println("   (" + c2 + ")^1 = " + pow1 + " (should be " + c2 + ")");

        // Test z^2
        PinsoeGustaveComplexNumber pow2 = c2.toThePowerOf(2);
        System.out.println("   (" + c2 + ")^2 = " + pow2);

        // Test z^3
        PinsoeGustaveComplexNumber pow3 = c2.toThePowerOf(3);
        System.out.println("   (" + c2 + ")^3 = " + pow3);

        // Test with simpler number: (1+i)^4
        PinsoeGustaveComplexNumber c7 = new PinsoeGustaveComplexNumber(1, 1);
        PinsoeGustaveComplexNumber pow4 = c7.toThePowerOf(4);
        System.out.println("   (" + c7 + ")^4 = " + pow4 + " (should be -4)");

        // Edge cases for printing
        System.out.println("\n7. Testing Printing Edge Cases:");
        PinsoeGustaveComplexNumber e1 = new PinsoeGustaveComplexNumber(0, 1); // i
        PinsoeGustaveComplexNumber e2 = new PinsoeGustaveComplexNumber(0, -1); // -i
        PinsoeGustaveComplexNumber e3 = new PinsoeGustaveComplexNumber(0, 2); // 2i
        PinsoeGustaveComplexNumber e4 = new PinsoeGustaveComplexNumber(3, 1); // 3+i
        PinsoeGustaveComplexNumber e5 = new PinsoeGustaveComplexNumber(3, -1); // 3-i

        System.out.println("   " + e1 + " (should be i)");
        System.out.println("   " + e2 + " (should be -i)");
        System.out.println("   " + e3 + " (should be 2i)");
        System.out.println("   " + e4 + " (should be 3+i)");
        System.out.println("   " + e5 + " (should be 3-i)");

        System.out.println("\n=== All Tests Complete ===");
    }
}
