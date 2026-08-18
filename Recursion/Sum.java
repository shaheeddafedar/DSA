// Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
package Recursion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your  values : ");
        int n = input.nextInt();
        int result = NumbersSum(n);
        System.out.println(result);
        input.close();
    }

    public static int NumbersSum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;

        int previoussum = NumbersSum(n - 1);
        sum = n + previoussum;
        return sum;
    }
}
