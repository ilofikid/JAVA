package com.mycompany.app;
import com.mycompany.math.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int sumResult = calculator.add(10, 5);
        System.out.println("Sum: " + sumResult);


        int subtractResult = calculator.subtract(20, 7);
        System.out.println("Subtraction: " + subtractResult);
    }
}
