// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

package Array.Easy;

import java.util.ArrayList;

public class isSorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        if (isSorted(nums)) {
            System.out.println("The Array is Sorted");
        } else {
            System.out.println("The Array is UnSorted");
        }

    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        boolean isSorted_Array = true;
        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                isSorted_Array = false;
            } 
        }
        return isSorted_Array;
    }
}
// Time complexity O(n);
// Space complexity O(1);