// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

package Basic_Math;

import java.util.Scanner;

public class Reverse_integer {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Integer values : ");
        int n = input.nextInt();
        int result = reverse(n);
        System.out.println("Reversed value  : " + result);
        input.close();
        
    }
    public static int reverse(int n){
        int digit=0;
        int revernum =0;
        while (n!=0) {
            digit=n%10;
            revernum=revernum*10+digit;
            n=n/10;
        }
        return revernum;
    }
}




//  or 
// class Solution {
//     public int reverse(int x) {
//            int digit=0;
//         int revernum =0;
//      while (x!=0) {
//             digit=x%10;
//          if (revernum > Integer.MAX_VALUE / 10 ||
//         revernum < Integer.MIN_VALUE / 10) {
//          return 0;
//          }  
//             revernum=revernum*10+digit;
//             x=x/10;
//         }
//         return revernum;
//     }
// }