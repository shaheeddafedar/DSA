// Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array
// Input: nums = [2, 3, 5, -2, 7, -4]
// Output: 15

package DSA_180.Arrays;
public class max_Subarray_or_Kadanes {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        int result = maxSubArray(arr);
        System.out.println("The maxSubarray sum is : " + result);
    }

   public static int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
          int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
           if (sum>max) {
            max=sum;
           }
           if (sum<0) {
            sum=0;
           }
        }
        return max;
    }
}


// public static void maxSubArray(int[] nums) {
//     int sum = 0;
//     int max = Integer.MIN_VALUE;

//     int start = 0;
//     int end = 0;
//     int tempStart = 0;

//     for (int i = 0; i < nums.length; i++) {
//         if (sum == 0) {
//             tempStart = i;
//         }
//         sum += nums[i];
//         if (sum > max) {
//             max = sum;
//             start = tempStart;
//             end = i;
//         }
//         if (sum < 0) {
//             sum = 0;
//         }
//     }
//     System.out.println("Maximum Sum = " + max);

//     System.out.print("Maximum Subarray = [");
//     for (int i = start; i <= end; i++) {
//         System.out.print(nums[i]);

//         if (i < end) {
//             System.out.print(", ");
//         }
//     }
//     System.out.println("]");
// }


// Brute force
// public static int maxSubArray(int[] arr) {
// int max=Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// int sum=0;
// for (int k = i;k<j; k++) {
// sum+=arr[k];
// }
// max=Math.max(max, sum);
// }
// }
// return max;
// }
// Time: O(n^3)
// Space: O(1)


// Better Soultion
// public static int maxSubArray(int[] arr) {
//         int max=Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//              int sum=0;
//            for (int j = i; j < arr.length; j++) {
//             sum+=arr[j];
//                     max=Math.max(max, sum);

//            }   

//         }
//         return max;
//     }

    // Time: O(n^2)
// Space: O(1)
