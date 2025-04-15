//created by Sk Naser Hussain on 15-04-2025

import java.util.Scanner;

public class NumberPalindrome {
    void check(int n) {
        int originalNum = n;
        int revNum = 0;

        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }

        if (revNum == originalNum) {
            System.out.println("\n" + originalNum + " is a palindrome number.");
        } else {
            System.out.println("\n" + originalNum + " is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();

        NumberPalindrome np = new NumberPalindrome();
        np.check(n);

        sc.close();
    }
}
