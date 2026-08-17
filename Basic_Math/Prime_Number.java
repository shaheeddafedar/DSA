// You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.
// A prime number is a number which has no divisors except 1 and itself.

package Basic_Math;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Integer values : ");
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println("The given Valus is a isPrime");
        } else {
            System.out.println("The given Valus is a Not a  isPrime");
        }
        input.close();
    }

        public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n<2) {
            isPrime=false;
        }
        for (int i = 2; i <=n/2; i++) { // or use sqrt
            if (n%i==0) {
                isPrime=false;
            } 
        }
        return isPrime;
    }
}
