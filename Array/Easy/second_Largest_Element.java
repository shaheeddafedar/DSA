// Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

package Array.Easy;

public class second_Largest_Element {

    public static void main(String[] args) {

        int[] arr = { 10, 5, 8, 20, 15 };
        int result = secondLargestElement(arr);
        System.out.println("The second largest vaue is : "+result);
    }

    public static int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean foundSecondLargest = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                foundSecondLargest = true;
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
                foundSecondLargest = true;
            }
        }

        if (!foundSecondLargest) {
            return -1;
        }

        return secondLargest;
    }
}

// Time complexity O(n);
// Space complexity O(1);
