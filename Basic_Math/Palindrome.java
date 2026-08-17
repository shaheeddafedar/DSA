// You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false
// A palindrome number is a number which reads the same both left to right and right to left.

package Basic_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Integer values : ");
        int n = input.nextInt();
        if (isPalindrome(n)) {
            System.out.println("The given Valus is a Plaindrome");
        } else {
            System.out.println("The given Valus is a Not a  Plaindrome");
        }
        input.close();
    }

    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int digit = 0;
        int reversedNumber = 0;
        while (n != 0) {
            digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
}
