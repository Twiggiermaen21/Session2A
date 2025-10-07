package test;


import org.junit.jupiter.api.Test;

import Calculator.Calculator;

public class CalculadoraTest {

	@Test
    public void testCalculator() {
        Calculator calc = new Calculator();

        System.out.println("=== Calculator Test ===");

        System.out.println("Sum (10 + 5): " + calc.sum(10, 5));
        System.out.println("Subtract (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Multiply (10 * 5): " + calc.multiply(10, 5));
        System.out.println("Divide (10 / 5): " + calc.divide(10, 5));
        System.out.println("Divide by zero (10 / 0): " + calc.divide(10, 0));

        System.out.println("========================");
    }
}
