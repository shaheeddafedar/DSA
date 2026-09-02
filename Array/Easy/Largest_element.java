// Given an array of integers nums, return the value of the largest element in the array

package Array.Easy;

public class Largest_element {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 6, 1 };
        if (arr.length > 0) {
            int result = largestElement(arr);
            System.out.println("Largest Element in Array is : " + result);

        } else {
            System.out.println("Invalid Array");
        }

    }

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

// Time complexity O(n);
// Space complexity O(1);