//Created by Sk Naser Hussain on 14-04-25

import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle {
    double base, height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Square {
    double side;

    public Square(double s) {
        side = s;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("Area of the circle is: " + c.calculateArea());
                break;

            case 2:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                Triangle t = new Triangle(base, height);
                System.out.println("Area of the triangle is: " + t.calculateArea());
                break;

            case 3:
                System.out.print("Enter side of the square: ");
                double side = scanner.nextDouble();
                Square s = new Square(side);
                System.out.println("Area of the square is: " + s.calculateArea());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
