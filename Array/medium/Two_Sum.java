// Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
// Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in any order.
// Input: nums = [1, 6, 2, 10, 3], target = 7
// Output: [0, 1]
package Array.medium;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr1 = { 1, 6, 2, 10, 3 };
        int[] result = twoSum(arr1, 7);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int[] result = new int[2];
     for (int i = 0; i < arr.length; i++) {
        int remder = target-arr[i];
        if (map.containsKey(remder)) {
            result[0]=map.get(remder);
            result[1]=i;
        }
       
            map.put(arr[i], i);
        
     }
     return result;
    }
}
// time complexity = o(n);
// Space complexity O(n);

// Brute Force
//  public static int[] twoSum(int[] arr, int target) {
//         int[] result = new int[2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if (i==j) {
//                     continue;
//                 }
//                 if (arr[i] + arr[j]== target) {
//                     result[0] = i;
//                     result[1] = j;
//                 }
//             }
//         }
//         return result;
//     }
// time complexity = o(n^2);
// Space complexity O(n);


//Optimal solution 1
// import java.util.Arrays;
// public class Two_Sum {
//     static class Pair {
//         int value;
//         int index;
//         Pair(int value, int index) {
//             this.value = value;
//             this.index = index;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {1, 6, 2, 10, 3};
//         int[] result = twoSum(arr1, 7);
//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
//     public static int[] twoSum(int[] arr, int target) {
//         Pair[] pairs = new Pair[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             pairs[i] = new Pair(arr[i], i);
//         }
//         Arrays.sort(pairs, (a, b) -> a.value - b.value);
//         int left = 0;
//         int right = pairs.length - 1;
//         while (left < right) {
//             int sum = pairs[left].value + pairs[right].value;
//             if (sum == target) {
//                 return new int[]{
//                     pairs[left].index,
//                     pairs[right].index
//                 };
//             }
//             else if (sum < target) {
//                 left++;
//             }
//             else {
//                 right--;
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }
// time complexity = o(n*log n);
// Space complexity O(1);