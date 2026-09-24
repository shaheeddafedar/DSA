// Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.
// Example 1:
// Input: nums = [1, 2, 1, 1, 3, 2]
// Output: [1]


package DSA_180.Arrays;
import java.util.ArrayList;
import java.util.List;

public class majorityElement_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 2 };
        List<Integer> result = majorityElementTwo(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<Integer> majorityElementTwo(int[] arr) {
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int min = arr.length / 3 + 1;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && arr[i] != element2) {
                count1 = 1;
                element1 = arr[i];
            } else if (count2 == 0 && arr[i] != element1) {
                count2 = 1;
                element2 = arr[i];
            } else if (element1 == arr[i]) {
                count1++;
            } else if (element2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        int count_value1 = 0, count_value2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element1 == arr[i])
                count_value1++;
            if (element2 == arr[i])
                count_value2++;
        }
        if (count_value1 >= min)
            ls.add(element1);
        if (count_value2 >= min)
            ls.add(element2);
        return ls;
    }

}
// Time O(2n) We ignore the constant 2.O(n)
// Space	O(1)

// Brute force
// public static List<Integer> majorityElementTwo(int[] arr) {
// List<Integer> ls = new ArrayList<>();
// for (int i = 0; i < arr.length; i++) {
// if (ls.size() == 0 || ls.get(0) != arr[i]) {
// int count = 0;
// for (int j = 0; j < arr.length; j++) {
// if (arr[j] == arr[i]) {
// count++;
// }
// }
// if (count > arr.length / 3) {
// ls.add(arr[i]);
// }
// if (ls.size() >= 2) {
// break;
// }
// }
// }
// return ls;
// }
// Time: O(n^2)
// Space: O(n)

// Better
// public static List<Integer> majorityElementTwo(int[] arr) {
// HashMap<Integer, Integer> hs = new HashMap<>();
// List<Integer> ls = new ArrayList<>();
// int min = arr.length / 3 + 1;
// for (int i = 0; i < arr.length; i++) {
// hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
// if (hs.get(arr[i]) == min) {
// ls.add(arr[i]);
// }
// if (ls.size() == 2) {
// break;
// }
// }
// return ls;
// }
// Time: O(n)
// Space: O(1)