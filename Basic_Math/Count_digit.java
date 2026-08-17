// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself
package Basic_Math;

import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Digit values : ");
        int n = input.nextInt();
        int result = counter(n);
        System.out.println("Enter Your Digit values : " + result);
        input.close();

    }

    public static int counter(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
