// Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

package Array.Easy;

public class second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 20, 15 };
        int result = secondLargestElement(arr);
        System.out.println(result);

    }

    public static int secondLargestElement(int[] nums) {
        if (nums.length<2) {
            return -1;
        }
        int largest = nums[0];
        int second_largest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                second_largest = largest;
                largest = nums[i];
            } else if (nums[i] > second_largest && nums[i] < largest) {
                second_largest = nums[i];
            }
        }

        return second_largest;
    }
}
// Time complexity O(n);
// Space complexity O(1);
