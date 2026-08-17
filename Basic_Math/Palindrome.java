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
        if (n < 0) {
            return false;
        }

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

// or
// return originalNumber == reversedNumber;




// package Basic_Math;

// import java.util.Scanner;

// public class Palindrome {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your integer value: ");
//         int n = input.nextInt();

//         if (isPalindrome(n)) {
//             System.out.println("The given value is a Palindrome");
//         } else {
//             System.out.println("The given value is not a Palindrome");
//         }

//         input.close();
//     }

//     public static boolean isPalindrome(int n) {

//         if (n < 0 || (n % 10 == 0 && n != 0)) {
//             return false;
//         }

//         int reversedHalf = 0;

//         while (n > reversedHalf) {
//             reversedHalf = reversedHalf * 10 + n % 10;
//             n /= 10;
//         }

//         return n == reversedHalf || n == reversedHalf / 10;
//     }
// }