//Created by Sk Naser Hussain on 16-04-2025

import java.util.Scanner;

public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero");
            return 0.0;
        }
        return a / b;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Simple Calculator using Method Overloading");
        System.out.println("-----------------------------------------");
        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calc.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calc.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calc.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calc.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


