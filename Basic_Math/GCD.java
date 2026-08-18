// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

package Basic_Math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First values : ");
        int n1 = input.nextInt();
        System.out.print("Enter Your Second values : ");
        int n2 = input.nextInt();
        int result = Gcd(n1, n2);
        System.out.println("The GCD is :"+result);
     input.close();
    }

    public static int Gcd(int n1, int n2) {
        int max = 0;
        int middle = n1 < n2 ? n1 : n2;
        for (int i = 1; i <= middle; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                max = i;
            }
        }
        return max;
    }
}


// GCD Using elucide algorithm
// public static int GCD(int n1, int n2) {
//     while (n2 != 0) {
//         int temp = n2;
//         n2 = n1 % n2;
//         n1 = temp;
//     }

//     return n1;
// }