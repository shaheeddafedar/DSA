// Given an integer array nums. Find the subarray with the largest product, and return the product of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.
// Example 1:
// Input: nums = [4, 5, 3, 7, 1, 2]
// Output: 840

package DSA_180.Arrays.LinearScan;

public class maximumProduct {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 7, 1, 2 };
        int result = maxProduct(arr);
        System.out.println("The maximum Product is : " + result);
    }

    public static int maxProduct(int[] arr) {
        int max = arr[0];
        int maxproduct = arr[0];
        int minproduct = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            maxproduct = Math.max(arr[i], maxproduct *= arr[i]);
            minproduct = Math.min(arr[i], minproduct *= arr[i]);
            max = Math.max(max, maxproduct);

        }
        return max;

    }
}
// Time: O(n)
// Space: O(1)

// brute force
// public static int maxProduct(int[] arr) {
// int max=Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// int product =1;
// for (int k = i; k <=j; k++) {
// product=product*arr[k];
// }
// if (product>max) {
// max=product;
// }
// }
// }
// return max;
// }
// Time: O(n^3)
// Space: O(1)

// Better solution
// public static int maxProduct(int[] arr) {
// int max=Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// int product =1;
// for (int j = i; j < arr.length; j++) {
// product=product*arr[j];

// if (product>max) {
// max=product;
// }
// }
// }
// return max;
// }
// Time: O(n^2)
// Space: O(1)