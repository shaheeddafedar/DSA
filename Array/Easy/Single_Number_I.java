// Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.
// Input : nums = [1, 2, 2, 4, 3, 1, 4]
// Output : 3



package Array.Easy;
public class Single_Number_I {
    public static void main(String[] args) {
        int[] arrs = { 1, 2, 2, 4, 3, 1, 4 };
        int result = singleNumber(arrs);
        System.out.println("The Single Number apperd is: " + result);
    }

    public static int singleNumber(int[] arrs) {
        int xor = 0;
        for (int i = 0; i < arrs.length; i++) {
            xor = xor ^ arrs[i];
        }
        return xor;
    }
}


// Time complexity O(n);
// Space complexity O(1);