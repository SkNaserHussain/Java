//created by Sk Naser Hussain on 15-04-2025

import java.util.Scanner;

public class Palindrome {
    
    
    void checkNumberPalindrome(int n) {
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

    
    void checkStringPalindrome(String text) {
        String original = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("\n\"" + text + "\" is a palindrome string.");
        } else {
            System.out.println("\n\"" + text + "\" is not a palindrome string.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome p = new Palindrome();

        System.out.println("Palindrome Checker Menu:");
        System.out.println("1. Check Number Palindrome");
        System.out.println("2. Check String Palindrome");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                p.checkNumberPalindrome(num);
                break;

            case 2:
                System.out.print("Enter text: ");
                String text = sc.nextLine();
                p.checkStringPalindrome(text);
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }

        sc.close();
    }
}
