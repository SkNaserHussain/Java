//created by Sk Naser Hussain on 15-04-2025

import java.util.Scanner;

public class StringPalindrome {
    void check(String text) {
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
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        StringPalindrome sp = new StringPalindrome();
        sp.check(input);

        sc.close();
    }
}
