// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false
// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
// Example 1
// Input: n = 153
// Output: true
// Explanation: Number of digits : 3.
// 13 + 53 + 33 = 1 + 125 + 27 = 153.
// Therefore, it is an Armstrong number.

package Basic_Math;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Integer values : ");
        int n = input.nextInt();
        if (isArmstrong(n)) {
            System.out.println("The given Valus is a Armstrong");
        } else {
            System.out.println("The given Valus is a Not a  Armstrong");
        }
        input.close();
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int digit = 0;
        int sumOfPowers = 0;
        int digitCount = 0;
        while (n != 0) {
            digit = n % 10;
            digitCount++;
            n /= 10;
        }
        n = originalNumber;

        while (n != 0) {
            digit = n % 10;
            sumOfPowers = sumOfPowers + (int) Math.pow(digit, digitCount);
                   n /= 10;
        }

        return originalNumber == sumOfPowers;
    }
}



// or
// while (n != 0) {
//             digit = n % 10;
//           int power = 1;
//             for (int i = 0; i < digitCount; i++) {
//                 power *= digit;
//             }
//             sumOfPowers += power;                 
//               n /= 10;
//         }

// return originalNumber==sumOfPowers;

