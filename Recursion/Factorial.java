// You are given an integer n. Return the value of n! or n factorial.
// Factorial of a number is the product of all positive integers less than or equal to that number.

package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your  values : ");
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println(result);
        input.close();
    }

    public static int factorial(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
       
        return n*factorial(n-1);
    }
}



// Time  → O(n)
// Space → O(n)