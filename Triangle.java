import java.util.Scanner;

public class Triangle {
    double base, height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        Triangle t = new Triangle(base, height);

        double area = t.calculateArea();
        System.out.println("Area of the triangle is: " + area);

        scanner.close();
    }
}
