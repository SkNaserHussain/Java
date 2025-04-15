//Created by Sk Naser Hussain on 15-04-25

import java.util.Scanner;

public class Prime {
    void checkPrime(int n) {
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 0 && n > 1) {
            System.out.println("\n" + n + " is a prime number");
        } else {
            System.out.println("\n" + n + " is not a prime number!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n = scanner.nextInt();

        Prime p = new Prime();
        p.checkPrime(n);

        scanner.close();
    }
}
