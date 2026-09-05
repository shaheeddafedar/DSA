// Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1
package Array.Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3 };
        int result = linearSearch(arr, 3);
        System.out.print(result);
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;

    }
}

// Time complexity O(n);
// Space complexity O(1);