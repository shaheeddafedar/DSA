// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
// Example 1
// Input: n=5, arr = [1,2,3,4,5]
// Output: [5,4,3,2,1]

package Recursion;

public class Reverse_array {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr, int i, int n) {
        if (i >= n / 2) {
            return;
        }

        swap(arr, i, n);

        reverse(arr, i + 1, n);
    }

    public static void swap(int[] arr, int i, int n) {
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }
}