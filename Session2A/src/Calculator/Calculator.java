package Calculator;

public class Calculator {

    // Method to return the sum of a and b
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to return the subtraction of a and b
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to return the multiplication of a and b
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to return the integer division of a and b
    // Returns -1 if b == 0
    public int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    // Optional: Main method for testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum: " + calc.sum(10, 5));         // 15
        System.out.println("Subtract: " + calc.subtract(10, 5)); // 5
        System.out.println("Multiply: " + calc.multiply(10, 5)); // 50
        System.out.println("Divide: " + calc.divide(10, 5));     // 2
        System.out.println("Divide by zero: " + calc.divide(10, 0)); // -1
    }
}

