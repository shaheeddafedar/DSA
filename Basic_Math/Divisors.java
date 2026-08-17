// You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
// A number which completely divides another number is called it's divisor.
// Example 1
// Input: n = 6
// Output = [1, 2, 3, 6]
// Explanation: The divisors of 6 are 1, 2, 3, 6.


package Basic_Math;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Integer  value : ");
        int n = input.nextInt();
        int[] result = divisors(n);
        System.out.println("Divisors are :");
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
        input.close();
    }

    public static int[] divisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
             if (n % i == 0) {
               count++;
            }
        }
        int[] divisorList = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList[index] = i;
                index++;
            }
        }
        return divisorList;
    }

}


// or


//     public static void divisor(int n){
//         TreeSet<Integer> ls = new TreeSet<Integer>();
//    for (int i = 1; i <=Math.sqrt(n); i++) {
//     if (n%i==0) {
//         ls.add(i);
//         if ((n/i)!=i) {
//           ls.add(n/i);
//         }
//     }
//    }
//    for (Integer integer : ls) {
//     System.out.println(integer);
//    }
//     }

