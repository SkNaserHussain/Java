import java.util.Scanner;


public class Circle {
    double radius;

    
    public Circle(double r) {
        radius = r;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double userRadius = scanner.nextDouble();

        
        Circle c = new Circle(userRadius);

        
        double area = c.calculateArea();
        System.out.println("Area of the circle is: " + area);

        scanner.close();
    }
}
