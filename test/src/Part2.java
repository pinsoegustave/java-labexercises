public class Part2 {

//    Instance variables
    double num1;
    double num2;
    String operator;

    public Part2() {
        num1 = 0;
        num2 = 0;
        operator = "";
    }

    public double bugsBunnyMath(double n1, double n2, String operation) {
        switch (operation) {
            case "+":
                return n1 + n2;

            case "-":
                return n1 - n2;

            case "*":
                return n1 * n2;

            case "/":
                if (n2 == 0) {
                    System.out.println("Error: Cannot divide by zero!!");
                    return 0;
                }
                return n1 / n2;

            default:
                System.out.println("Error: Unknown operation '" + operation + "'. Bugs Bunny only knows +, -, *, /");
                return 0;
        }
    }
}
