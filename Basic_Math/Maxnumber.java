package Basic_Math;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max =0;
                System.out.println("Enter your Elements ");
        for (int i = 0; i <=5; i++) {
            int num = input.nextInt();
            if (num>max) {
                max=num;
            }
        }
        System.out.println("the maximum Number is "+max);
 input.close();
    }
}
