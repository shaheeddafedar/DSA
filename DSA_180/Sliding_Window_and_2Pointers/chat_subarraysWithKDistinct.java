// Given an integer array nums and an integer k, return the number of good subarrays of nums.
// A good array is an array where the number of different integers in that array is exactly k.
// For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
// A subarray is a contiguous part of an array.
// Example 1:
// Input: nums = [1,2,1,2,3], k = 2
// Output: 7
// Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

package DSA_180.Sliding_Window_and_2Pointers;

import java.util.HashMap;

public class chat_subarraysWithKDistinct {
    public static void main(String[] args) {
        
    }
}



// Brute force
//  public int subarraysWithKDistinct(int[] nums, int k) {
//         int count =0;
//         for(int i =0;i<nums.length;i++){
//             HashMap<Integer,Integer> map = new HashMap<>();
//             for(int j =i;j<nums.length;j++){
//                 map.put(nums[j],map.getOrDefault(nums[j], 0) + 1);
//                 if (map.size() == k) {
//                     count++;
//                 } 
//                 else if (map.size() > k) {
//                     break;
//                 }
//             }
//         }
//         return count;
//     }

//  Time:O(m*n);
//  Space:O(1);   
