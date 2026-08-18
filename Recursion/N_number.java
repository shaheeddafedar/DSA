// Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
// You must not use any loops such as for, while, or do-while.
// The function should print each number on a separate line, in increasing order from 1 to n.

package Recursion;

import java.util.Scanner;

public class N_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your  values : ");
        int n = input.nextInt();
        printNumbers(n);
        input.close();

    }
    public static void printNumbers(int n) {
    if (n == 0) {
        return;
    }

    printNumbers(n - 1);
        System.out.println(n);

}
}


    //or  
    // public static void printNumbers(int current,int n) {
    //     if (current>n ) {
    //         return;
    //     }
    //     System.out.println(current);
    //     printNumbers(current+1,n);
    // }
