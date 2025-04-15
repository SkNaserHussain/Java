//Created by Sk Naser Hussain on 14-04-25

import java.util.Scanner;

public class Square {
    double side;

    public Square(double s) {
        side = s;
    }

    public double calculateArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        Square sq = new Square(side);

        double area = sq.calculateArea();
        System.out.println("Area of the square is: " + area);

        scanner.close();
    }
}