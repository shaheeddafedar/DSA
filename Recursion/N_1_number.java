// Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
// You must not use any loops such as for, while, or do-while.
// The function should print each number on a separate line, in decreasing order from n to 1

package Recursion;

import java.util.Scanner;

public class N_1_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your  values : ");
        int n = input.nextInt();
        printNumbers(n);
        input.close();
    }

       public static void printNumbers(int n) {
       if (n==0) {
        return;
       }
       System.out.println(n);
       printNumbers(n-1);
    }
}
